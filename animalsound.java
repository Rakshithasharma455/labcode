package assignment3;
import java.util.Scanner;


class Animal
{
	public void makeSound()
	{
		System.out.println("The animal makes a sound.");
	}
}
class Dog extends Animal
//overriding
{
   public void makeSound()
   {
	   System.out.println("The dog barks.");
   }
}
class Cat extends Animal
{
//overriding
public void makeSound()
   {
	System.out.println("The cat meows.");
   }
}
public class animalsound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an animal(1 for Dog, 2 for Cat):");
		int choice = sc.nextInt();
		Animal animal;
		switch (choice) {
		case 1:
			animal = new Dog();
			break;
		case 2:
			animal = new Cat();
			break;
		default:
			System.out.println("Invalid choice.");
			return;
		}
		    animal.makeSound();
			sc.close();
			
		}

	}

