package javaoopsconcept;

public class StaticAndNonStaticConcept {
	//scope of global variables will be available across the function with some condition.Condition is if it is static then we can call directly or by using class name
	//and other option if it is non static then we need to create object,by using object reference variable we can call non static method name and variable.
	//non static global variable
	String name= "Tom";
	//static global variable
	static int age=25;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call static method 
		//1.option 1:directly by using static method name
    sum();
	//2.option 1:by using Class  name
    StaticAndNonStaticConcept.sum();
    
    //how to call non static method and variables
    StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
    obj.sendMail();
    System.out.println(obj.name);
    //can i access static method by using object reference==>Yes
    obj.sum();
	}
	//non static method
	public void sendMail(){
		System.out.println(name);
	}
	//static method
	public static void sum(){
		System.out.println(age);
	}

}
