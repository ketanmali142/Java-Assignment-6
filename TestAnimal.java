package Assignment6;

abstract class Animal {

	abstract public void sound();

	public void move() {

		System.out.println("walk , run , eat and sleep");

	}

}

class Dog extends Animal {

	@Override

	public void sound() {

// TODO Auto-generated method stub

		System.out.println("the dog barks");

	}

	public void move() {

		System.out.println("run");

	}

}

class Cat extends Animal {

	public void sound() {

		System.out.println("meowwww");

	}

	public void move() {

		System.out.println("walk and run");

	}

}

class Bird extends Animal {

	public void sound() {

		System.out.println("chirps");

	}

	public void move() {

		System.out.println("fly in the sky");

	}

}

public class TestAnimal {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		Dog dog = new Dog();

		dog.move();

		dog.sound();

		System.out.println("=====================");

		Cat cat = new Cat();

		cat.move();

		cat.sound();

		System.out.println("=====================");

		Bird bird = new Bird();

		bird.move();

		bird.sound();

	}

}