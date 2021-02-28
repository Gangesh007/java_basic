package javabasics;

public class B29122020 extends A29122020{
	public B29122020() {
		//super();
		System.out.println("Child class constructor");
	}
	public B29122020(int i) {
		super(i);
		System.out.println("1 para Child class constructor");
	}
	public B29122020(int i, int j) {
		super(i,j);
		System.out.println("2 para Child class constructor");
	}
	public B29122020(int i, int j, int k) {
		super(i,j,k);
		System.out.println("3 para Child class constructor");
	}
	public static void main(String[] args) {
		B29122020 obj = new B29122020();
		B29122020 obj1 = new B29122020(7);
		B29122020 obj2 = new B29122020(7,5);
		B29122020 obj3 = new B29122020(7,5, 9);
	}
}
