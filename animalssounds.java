package day3;
class Animal     //superclass called animal
{
	public void makeSound()
	{
		System.out.println("the animal makes a sound.");
	}
}
//subclass for dog
class Dog extends Animal
{
	//overriding the method
	public void makeSound()
	{
		System.out.println("the dog barks");
	}
}
//subclass for cat
class Cat extends Animal
{
	//overiding the method 
	public void makeSound()
	{
		System.out.println("the cat meows");
	}
}

public class animalssounds {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		a.makeSound();
		d.makeSound();
		c.makeSound();

	}

}
