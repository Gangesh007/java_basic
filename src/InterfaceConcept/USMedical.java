package InterfaceConcept;

public interface USMedical extends WHO {
	int min_fee=10;
 void physicoService();
 void oncologyService();
 void orthologyService();
 //Cannot create object of interfaces
 //only method declaration
 //method protptype-->no metgod body-->Abstract method
 //cannot crete static prototype method in interface-->we cannot override static method
 //but interface variable static and final by default
 //static method body in interface 
 //From JDK 1.8,static method allow in interface but with method body
 static void Services_911(){
	 System.out.println("US--911service");
 }
 
 //Why Interfcae allow static method body?
 //default cannot be static ,so can we override this default method
 default void internship(){
	 System.out.println("USinternship");
 }
}
