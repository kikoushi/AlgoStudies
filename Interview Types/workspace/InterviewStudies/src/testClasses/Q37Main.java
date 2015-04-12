package testClasses;
import dataStructures.*;

public class Q37Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Q37 animalQueue = new Q37();
		animalQueue.enqueue(new Q37CatClass("cat1"));

		animalQueue.enqueue(new Q37DogClass("dog1"));
		animalQueue.enqueue(new Q37DogClass("dog2"));
		
		animalQueue.enqueue(new Q37CatClass("cat2"));
		animalQueue.enqueue(new Q37CatClass("cat3"));
		
		animalQueue.enqueue(new Q37DogClass("dog3"));
		animalQueue.enqueue(new Q37DogClass("dog4"));
		
		animalQueue.enqueue(new Q37CatClass("cat4"));

		Q37AnimalClass animal, animal2;
		try {
			animal = animalQueue.dequeueDog();
			System.out.println(animal.getIndex() + " " + animal.getName());
			
			animal2 = animalQueue.dequeueCat();
			System.out.println(animal2.getIndex() + " " + animal2.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
