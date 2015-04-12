package dataStructures;

public class Q31 {

	private int stackSize;
	private int[] buffer; // buffer keeps all  
	private int[] stackPointer = {-1,-1,-1};
		
	public Q31(){
		stackSize = 100;
		buffer = new int[stackSize * 3];
	}	
	
	public Q31(int _stackSize, int arraySize){
		stackSize = _stackSize;
		buffer = new int[stackSize * arraySize];
		stackPointer = new int[arraySize];
		for(int i=0; i<arraySize; i++)
			stackPointer[i] = -1;
	}

	public void push(int stackNum, int value) throws Exception{
		if ( stackPointer[stackNum]+1 >= stackSize )
			throw new Exception("Out of stack space");
		stackPointer[stackNum]++;
		buffer[absPlace(stackNum)] = value; // to add to the absolute end of the buffer.  
	}
	
	public int pop(int stackNum) throws Exception{
		if(isEmpty(stackNum))
			throw new Exception("Stack is empty.");
		
		int val = buffer[absPlace(stackNum)];
		stackPointer[stackNum]--;
		buffer[absPlace(stackNum)] = 0;
		return val;
	}
	
	public int peek(int stackNum) throws Exception{
		if(isEmpty(stackNum))
			throw new Exception("Stack is empty.");
		return buffer[absPlace(stackNum)];
	}
	
	int absPlace(int stackNum){
		return stackNum * stackSize + stackPointer[stackNum];
	}
	
	boolean isEmpty(int stackNum){
		if( stackPointer[stackNum] == -1 )
			return true;
		return false;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<stackPointer.length; i++){
			sb.append("Stack No." + (i+1) + "\n");
			sb.append("---------\n");
			for(int j=0; j<stackPointer[i]; j++){
				sb.append(buffer[i * stackSize + j] + ",");
			}
			sb.append("\n\n");
		}
		return sb.toString();
	}
	
}
