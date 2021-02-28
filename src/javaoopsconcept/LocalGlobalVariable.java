package javaoopsconcept;

public class LocalGlobalVariable {
	
	//Global variable or class variable
	String name="Gangesh";
	int age=30;
public static void main(String[] args) {
	//loca variable 
	int i=5;
	System.out.println(i);
	LocalGlobalVariable obj= new LocalGlobalVariable();
	System.out.println(obj.name);
	System.out.println(obj.age);
	System.out.println(obj.m1());
}

public int m1() {
	int i=9;
	System.out.println(i);
	int age=31;
	return age;
}
}
