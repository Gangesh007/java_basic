package javaoopconceptpart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static polymorphism-->C.T.P
		//child class can access parent as well child method
  BMWCar b=new BMWCar();
  b.start(); 
  b.stop();
  b.refuel();
  b.m1();
  b.engine();
  //parent can access only his own method
  Car c =new Car();
  c.start();
  c.stop();
  c.refuel();
  //child class object can be referred by parent class reference variable .i.e R.T.M OR Dynamic plymorphism
  
  //upcasting
  Car c1=new BMWCar();
  c1.start();
  c1.stop();
  c1.refuel();
  //cannot access child method,only we can access parent method or common method, 
 // c1.m1()
  //downcasting
  //BMWCar b1=(BMW)new Car();//CLASS CAST EXCEPTION
  
  
  Vehicle v1 = new BMWCar();
  v1.engine();
  
  
  
	}

}
