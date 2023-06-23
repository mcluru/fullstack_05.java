package com.lec.ex01_interface;

public class animalMain {

	public static void main(String[] args) {
		
		// interface도 추상클래스처럼 객체생성 불가
//		Animal animal = new Animal();
		
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Bird());
		
		
	}

	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breath();
	}


}


class Bird implements Animal {
	
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
	
}