package javaoopconceptpart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(USBank.balance);
    HSBCBank obj = new HSBCBank();
    obj.credit();
    obj.debit();
    obj.transfermoney();
    obj.educationloan();
    obj.mutualfund();
    
    USBank ob1= new HSBCBank();
    ob1.credit();
    ob1.debit();
    ob1.transfermoney();
    
    
    BrazilBank ob2=new HSBCBank();
    ob2.mutualfund();
	}

}
