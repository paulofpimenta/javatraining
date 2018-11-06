package tp;

import java.util.Scanner;

import tp.Retangle;

public class TestRetangle {

	public TestRetangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the retangle height : ");
		Double h = sc.nextDouble();
		System.out.println("Input the retangle height : ");
		Double w = sc.nextDouble();
		sc.close();
		
		Retangle retangle = new Retangle(h,w);
		
		
		retangle.showDimensions();
	}

}
