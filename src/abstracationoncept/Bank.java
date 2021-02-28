package abstracationoncept;

public abstract  class Bank {
	int amt=100;
	final int rate=10;
	static int loanRate=5;
	//1.Abstarct Class:
	//1.Should atleast 1 abstarct method
 //abstract method with only declaration
	//Abstraction means:To hide some implementation logic by using abstraction method declaration
	//partial abstraction(abstract as well as non abstract methods)
	//abstract class can have abstract method and non abstract method
	//Can not create the object of abstarct classess
	//we can define non-static,final and static variable in abstract classess
	abstract void loan();
	// non abstarct method
	void cedit(){
		System.out.println("Bank Credit");
	}
	void debit(){
		System.out.println("Bank Debit");
	}
}
