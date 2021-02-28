package javaoopconceptpart2;

public class HSBCBank implements USBank, BrazilBank {
//is a relationship
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("add money");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("minus money");
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("send money");
	}
	
	public void educationloan(){
		System.out.println("child method1");
	}

	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		
		System.out.println("MUTUAL FUND");
		
	}

}
