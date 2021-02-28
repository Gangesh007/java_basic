package abstracationoncept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BMWCar b = new BMWCar();
 b.start();
 b.stop();
 b.refuel();
 b.theftSafety();
 //Dynamic polymorphism
 Car c= new BMWCar();
 c.start();
 c.stop();
 c.refuel();
	}

}
