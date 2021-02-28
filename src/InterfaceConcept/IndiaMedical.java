package InterfaceConcept;

public interface IndiaMedical {
void emergencyService();
void neuroService();
void petridicService();
//Cannot create object of interfaces


static void dengueService(){
	System.out.println("Indian-->dengue");
}
}
