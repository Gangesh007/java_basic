package javaoopconceptpart2;

public class BMWCar extends Car {
	//Method overridding:
		//same method present with same name with same number of argument and same data type present in parent and child class.
	//preference is given to child class method i.e overridden method
 public void start(){
	 System.out.println("BMW==>Starts");
 }
 public void m1(){
	 System.out.println("Child Method");
 }
}
