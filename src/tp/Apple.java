package tp;

import tp.Fruit;
public class Apple extends Fruit {

	public Apple(int w)  {
		weight = w;
	}
	
	@Override
	public void show() {
		System.out.println("I am an apple");
	}
	
	public void showWeight() {
		System.out.println("This apple's weight is " + weight + "g");
	}
}
