package javabasics;

public class LoopConcept25122020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.while loop
		int i=1;

		while (i<=10) {
			System.out.println(i);
			i++;

		}
		System.out.println("************************************************");
		//2/ for loop
		for (int j = 1; j < 10; j++) {
			System.out.println(j);
		}
		//post increment
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b); //1
		//pre-increment
		int c=5;
		int d=++c;
		System.out.println(c);//6
		System.out.println(d);//6


		//post decrement
		int x=1;
		int y=x--;
		System.out.println(x);//0
		System.out.println(y); //1
		//pre-decrement
		int p=5;
		int q=--p;
		System.out.println(p);//4
		System.out.println(q);//4

	}


}
