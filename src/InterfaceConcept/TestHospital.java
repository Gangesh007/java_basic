package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AppoloHospital ap=new AppoloHospital();
  ap.ambulanceService();
  ap.emergencyService();
  ap.ENTService();
  ap.medicalInsurance();
  ap.oncologyService();
  ap.orthologyService();
  ap.pathalogy();
  ap.petridicService();
  ap.physicoService();
  System.out.println(USMedical.min_fee);
  USMedical.Services_911();
  IndiaMedical.dengueService();
  ap.internship();
  ap.globalServices();
  //upcasting-->child class object referred by parent interface reference variable
 USMedical us=new AppoloHospital();
 us.physicoService();
 us.oncologyService();
 us.orthologyService();
 us.internship();
 UKMedical uk=new AppoloHospital();
 uk.ambulanceService();
 uk.ENTService();
 
IndiaMedical in= new AppoloHospital();
in.emergencyService();
in.neuroService();
in.petridicService();


//DOWNCASTING NT ALLOW IN INTERFACE bcoz we cannot create object for interface
 
	}
}
