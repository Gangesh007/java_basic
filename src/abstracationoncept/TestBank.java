package abstracationoncept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFCBank hb=new HDFCBank();
hb.cedit();
hb.debit();
hb.loan();
hb.funds();

Bank b= new HDFCBank();
b.loan();
b.cedit();
b.debit();


	}

}
