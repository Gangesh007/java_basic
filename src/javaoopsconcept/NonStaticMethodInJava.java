package javaoopsconcept;

public class NonStaticMethodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create object ,obj is the reference variable ,referring to this object
		NonStaticMethodInJava obj=new NonStaticMethodInJava();
		//only one time object will create
		//after creating  the object ,copy of all non static method will given to the object
		obj.test();
		obj.m1();
		obj.m2();
		obj.m3(80, 90);
		

	}
	
	//non static method in java
	public void test() {
		System.out.println("non static method with no return type");
	}
	public int m1(){
		System.out.println("non static method with return type  integer");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String m2(){
		System.out.println("non static method with return type  String");
	    String s="Gangesh";
	    System.out.println(s);
		return s;
	}
	
	public int m3(int a , int b){
		System.out.println("non static method with return type  integer");
		int c=b/a;
		return c;
	}
	
		
	}
	


