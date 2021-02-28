package javabasics;

public class ConstructorConcept {
//while creating the object need to initialize /define some class feature in the form of global variable or object
	//does not return any value
	//constructor name should be class name
	//It's not a method
	//1.Default constructor
	//Constructor can be overloaded
	
	//called immediately the moment u create the object
	//while creating the class, default constructor will create automatically if you do not declare constructor
	public ConstructorConcept() {
		// TODO Auto-generated constructor stub
		System.out.println("Default onstructor");
	}
	//2.Parameterized Constructor
	public ConstructorConcept(int a){
		System.out.println("Single Parameterized Constructor");
	}
	public ConstructorConcept(int a, int b){
		System.out.println("Double Integer Parameterized Constructor");
	}
	public ConstructorConcept(String s, int b){
		System.out.println("String and INteger Parameterized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConstructorConcept obj = new ConstructorConcept();
     ConstructorConcept obj1 = new ConstructorConcept(20);
     ConstructorConcept obj2 = new ConstructorConcept(20);
     ConstructorConcept obj3 = new ConstructorConcept(20);
	}
	


}
