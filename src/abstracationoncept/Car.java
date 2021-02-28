package abstracationoncept;

public interface Car {
	//Interface:Only method declaration
	//no need to write abstarct keyword
	//Use Interface instead of Class
	//acheive 100% abstarction
	//no method body, only method declration
	//Blueprint of the method
	//Can not create object of Interfaces
	//we can define final and static variable in Interfaces
	
	int wheels =4;
void start();
void stop();
void refuel();
}
