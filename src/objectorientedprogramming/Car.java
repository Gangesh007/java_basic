package objectorientedprogramming;

public class Car {
//Method Hiding
	//Cannot override static method
	public static void  start(){
		System.out.println("Start");
	}

	void stop(){
		System.out.println("Stop");
	}
	void refuel(){
		System.out.println("Refuel");
	}
}
