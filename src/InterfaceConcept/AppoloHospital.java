package InterfaceConcept;

public class AppoloHospital extends GlobalPatient implements UKMedical,USMedical,IndiaMedical{

	@Override
	public void emergencyService() {
		// TODO Auto-generated method stub
		
		System.out.println("AP-->emergency");
		
	}

	@Override
	public void neuroService() {
		// TODO Auto-generated method stub
		System.out.println("AP-->neuro");
	}

	@Override
	public void petridicService() {
		// TODO Auto-generated method stub
		System.out.println("PETRIDIC");
	}

	@Override
	public void physicoService() {
		// TODO Auto-generated method stub
		System.out.println("AP-->physio");
	}

	@Override
	public void oncologyService() {
		// TODO Auto-generated method stub
		System.out.println("AP-->oncology");
	}

	@Override
	public void orthologyService() {
		// TODO Auto-generated method stub
		System.out.println("AP-->orthology");
	}

	@Override
	public void ENTService() {
		// TODO Auto-generated method stub
		System.out.println("AP-->ENT");
	}

	@Override
	public void ambulanceService() {
		// TODO Auto-generated method stub
		System.out.println("AP-->amulance");
	}
	//WHO
	@Override
	public void polioServices() {
		// TODO Auto-generated method stub
		System.out.println("WHO");
		
	}
	
	//non -overrden methods
	void OPTService(){
		System.out.println("AP-OPTServices");
	}
	void medicalInsurance(){
		System.out.println("AP-->Medical Insurance");
	}
	void pathalogy(){
		System.out.println("AP-->pathalogyService");
	}

	

}
