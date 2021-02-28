package javabasics;

public class IfElseCondition23122020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =30;
		int b= 20;
		int c =40;



		if (a>b) {
			System.out.println("a is greater than b");
		}
		else{
			System.out.println("b is greater than a");
		}

		if (a==c) {
			System.out.println("a is equal to c");
		}
		else {
			System.out.println("a is not equal to c");

		}

		//Write a logic to find the highest number
		int x = 100;
		int y = 200;
		int z = 300;


		if (z>x & z>y) {
			System.out.println(z);
		}
		else if (x>y & x>z) {
			System.out.println(x);
		}
		else {
			System.err.println(y);
		}


	}

}
