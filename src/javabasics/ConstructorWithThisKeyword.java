package javabasics;

public class ConstructorWithThisKeyword {
	String name;
	int age;
	String emailID;

	//this keyword is used to intialize global variable with the current value of constructor
	public ConstructorWithThisKeyword(String name, int age, String email) {
		this.name=name;
		this.age=age;
		emailID=email;
		System.out.println(name +  age + email);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30, "jha@123");

	}

}
