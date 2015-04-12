package dataStructures;
import java.util.LinkedList;
import java.util.Queue;

public class Q37 {
	
	private LinkedList<Q37DogClass> dogList;
	private LinkedList<Q37CatClass> catList;
	private int index;
	
	public Q37(){
		dogList = new LinkedList<Q37DogClass>();
		catList = new LinkedList<Q37CatClass>();
		index = 0;
	}
	
	public void enqueue(Q37AnimalClass animal){
		animal.setIndex(index++);
		if(animal instanceof Q37DogClass)
			dogList.addLast((Q37DogClass)animal);
		else if(animal instanceof Q37CatClass)
			catList.addLast((Q37CatClass)animal);
		else
			return;		
	}
	
	public Q37AnimalClass dequeueAny() throws Exception{
		if(dogList.isEmpty() && catList.isEmpty())
			throw new Exception("No Animal Left!");
		
		if(dogList.isEmpty() && !catList.isEmpty())
			return catList.pollFirst();
		else if(!dogList.isEmpty() && catList.isEmpty())
			return dogList.pollFirst();
		else{
			int dogIdx = dogList.getFirst().getIndex();
			int catIdx = catList.getFirst().getIndex();
			if(dogIdx < catIdx)
				return dogList.pollFirst();
			return catList.pollFirst();					
		}		
	}
	
	public Q37CatClass dequeueCat() throws Exception{
		if(catList.isEmpty())
			throw new Exception("No Cat Left!");
		return catList.pollFirst();		
	}
	
	public Q37DogClass dequeueDog() throws Exception{
		if(dogList.isEmpty())
			throw new Exception("No Dog Left!");
		return dogList.pollFirst();
	}
	

}
