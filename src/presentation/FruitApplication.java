package presentation;

import tp.Apple;
import tp.Orange;
import tp.Fruit;

public class FruitApplication {

	public static void main(String[] args) {
		
		//Instantiate objects
		Fruit fruit = new Fruit();
		Apple pinkLady = new Apple(200);
		Orange laranja = new Orange(300);
		
		Fruit[] fruits = new Fruit[3];
		
		fruits[0] = fruit;
		fruits[1] = pinkLady;
		fruits[2] = laranja;
		
		
		//Call object's methods
		//pinkLady.show();
		//pinkLady.showWeight();
		
		//laranja.show();
		//laranja.showWeight();
		
		// On peu caster int vers un double, mais pas un un Integer vers un Double:
		// On peu utliser un instanceof pour Integer et Double, mais pas pour les types primitives 'int' et 'double'
		//int x = 10;
		//if (x == (int)x) {
		//	System.out.println("x is: " + (double) x);
		//}
		//boolean isint = (x == (int)x) ? System.out.println("x is: " + (double) x):  System.out.println("test");
		
		
		
	
	}
	
	}
