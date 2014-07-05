/*
Source:
Cracking the code interview Chapter 3 Question 6

Question:
The animal shelter holds only dogs and cats, and operates on a stictly
"Firt in, first out" basis. People must adopt either the "oldest"
(based on arrival time) of all animals at the shelter, or they can select
whether they would prefer a dog or cat (and will receive the oldest animal of that type).
They cannot select which specific animal they would like. Create the data structures to maintain
this system and implemetn operations such as enqueue, dequeueAny, dequeueDog and dequeueCat.
You may use the build in Linked List data structure

Solution:
Use a seperate queue for dog and cat with a wrapper called animal queue.
Store some sort of timestamp to mark when each animal was enqued.
When we dequeueAny, peek at the heads of both cat and dog and return oldest
*/

import java.util.*;

abstract class Animal 
{
	private int order;
	protected String name;
	public Animal(String name)
	{
		this.name = name;
	}

	public void setOrder(int order)
	{
		this.order = order;
	}

	public int getOrder() 
	{
		return this.order;
	}

	public boolean isOlderThan(Animal animal)
	{
		return this.order < animal.getOrder();
	}
}

class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
}

class Cat extends Animal
{
	public Cat(String name)
	{
		super(name);
	}
}


class AnimalQueue 
{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;		//Simple timestamp

	public void enqueue(Animal animal)
	{
		animal.setOrder(order);
		order++;

		if (animal instanceof Dog )
		{
			dogs.addLast((Dog)animal);
		}
		else if(animal instanceof Cat) {
			cats.addLast((Cat)animal);
		}
		else {
			System.out.println("Error Enqueining: Unknown instance of Animal!\n");
		}

	}

	public Animal dequeueAny()
	{
		if(dogs.size() == 0 && cats.size() == 0)
			return null;
		else if(dogs.size() == 0)
			return dequeueCats();
		else if(cats.size() == 0)
			return dequeueDogs();
			
		Dog dog = dogs.peek();
		Cat cat = cats.peek();

		if(dog.isOlderThan(cat))
			return dequeueDogs();
		else
			return dequeueCats();

	}

	public Dog dequeueDogs()
	{
		return dogs.poll();
	}

	public Cat dequeueCats()
	{
		return cats.poll();
	}


}


public class AnimalShelter
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
