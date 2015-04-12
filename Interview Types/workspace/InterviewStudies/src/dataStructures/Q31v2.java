package dataStructures;

public class Q31v2 {
	
	private int bufferSize = 1000; 
	private int[] buffer = new int[bufferSize];
	private int[] stackCounter = {-1,-1,-1};
	private int stackSize = stackCounter.length;
	
	public void push(int stackNum, int value) throws Exception{
		if(stackNum > stackSize)		throw new Exception("No such Stack.");
		if(buffer[bufferSize-1] != 0)	throw new Exception("Stack is Full!");
		
		shiftRight(stackNum);
		updateStackCounter(stackNum, true); // true = increment pointers
		buffer[stackCounter[stackNum]] = value;
	}
	
	
	public int pop(int stackNum) throws Exception{
		if(stackNum > stackSize)			throw new Exception("No such Stack.");
		if(stackCounter[stackNum] == -1)	throw new Exception("Stack is Empty.");
		if(stackNum != 0)
			if(stackCounter[stackNum-1] == stackCounter[stackNum])
				throw new Exception("Stack is Empty.");
		
		int value = buffer[stackCounter[stackNum]];
		shiftLeft(stackNum);
		updateStackCounter(stackNum, false); // false = decrement pointers
		
		return value;	
	}
	
	void updateStackCounter(int stackNum, boolean increment){
		for(int i=stackNum; i<stackSize; i++){
			if(increment)
				stackCounter[i]++;
			else
				stackCounter[i]--;
		}
	}
	
	void shiftRight(int stackNum){		
		if(stackNum == stackSize-1)
			return;
		
		int startPoint = stackCounter[stackNum];
		int endPoint = stackCounter[stackSize-1];
		
		for(int j=endPoint; j>startPoint; j--)
			buffer[j+1] = buffer[j];		
	}
	
	void shiftLeft(int stackNum){
		
		int startPoint = stackCounter[stackNum];
		int endPoint = stackCounter[stackSize-1];
		
		for(int j=startPoint; j<=endPoint; j++)
			buffer[j] = buffer[j+1];			
	}	
	
	
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<stackSize; i++){
			int a = (i==0) ? 0 : stackCounter[i-1]+1;
			for(int j=a; j<=stackCounter[i]; j++)
				sb.append(buffer[j] + " ");
			sb.append(" || ");	
		}
		sb.append("\n");
		
		for(int bff: buffer){
			if(bff == 0) break;
			sb.append(bff + ",");
		}		
		
		return sb.toString();
	}
	
}
