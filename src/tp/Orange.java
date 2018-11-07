package tp;

import tp.Fruit;
public class Orange extends Fruit {

	public Orange(int w)  {
		weight = w;
	}
	
	@Override
	public void show() {
		System.out.println("I am an Orange");
	}
	
	public void showWeight() {
		System.out.println("This orange's weight is " + weight + "g");
	}
}