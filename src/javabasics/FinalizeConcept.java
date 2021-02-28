package javabasics;

public class FinalizeConcept {
//finalize is the method
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FinalizeConcept f1= new FinalizeConcept();
		FinalizeConcept f2 =new FinalizeConcept();
		
		f1=null;
		f2=null;
		f1.finalize();
		f2.finalize();
		System.gc();
		
	}
	
	/*public void finalize(){
		System.out.println("finalize method");
	}*/

}
