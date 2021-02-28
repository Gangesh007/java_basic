package javaoopsconcept;

public class Car {
	
	//instance variable
	
	//declaration
	int model;
	int wheel;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//new Car()==>is the Object of Car	
//new is the keyword to create object
//BMW is the reference variable or type of Car
	Car BMW = new Car();
	Car HUNDAYI = new Car();	
	Car NANO = new Car(); 
	//intialization
	BMW.model=2013;
	BMW.wheel=4;
	
	HUNDAYI.model=2016;
	HUNDAYI.wheel=4;
	System.out.println("Before assigning the reference variable");
	System.out.println(BMW.model);
	System.out.println(BMW.wheel);
	
	System.out.println(HUNDAYI.model);
	System.out.println(HUNDAYI.wheel);
	
	System.out.println(NANO.model);
	System.out.println(NANO.wheel);
	
	
	System.out.println("After assigning the reference variable");
	
	BMW=HUNDAYI;
	HUNDAYI=NANO;
	NANO=BMW;
	System.out.println(BMW.model);
	System.out.println(BMW.wheel);
	
	System.out.println(HUNDAYI.model);
	System.out.println(HUNDAYI.wheel);
	
	System.out.println(NANO.model);
	System.out.println(NANO.wheel);
	}

}
