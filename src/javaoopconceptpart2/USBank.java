package javaoopconceptpart2;

public interface USBank {

	//only method declaration ,no method body

	//can declare the variables ,variable are by default static in nature, we cannot change the value of variable
	//no static method in interface

	//no main method
	
	//can not create object
	//it is abstract in nature
	
	//methods are non static 
	int balance=100;
	void credit();
	void debit();
	void transfermoney();
}
