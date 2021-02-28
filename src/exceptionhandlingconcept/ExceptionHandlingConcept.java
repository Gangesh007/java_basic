package exceptionhandlingconcept;

public class ExceptionHandlingConcept {
/*	int a=10;
	static ExceptionHandlingConcept obj;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uncaught exception, execute then u will get to know what type of exception is this
	/*	int i=9/0;
		System.out.println(i);*/
		
		//caught exception
		/*Thread.sleep(2000);*/
		
		//1.try catch block:
		try {
			int i=9/0;//this code will throw an exception
		} catch (ArithmeticException  e) {
			// TODO: handle exception
			//System.out.println("It is an Arithmetic exception");
			e.printStackTrace();
		}
		System.out.println("ABC");


		
	}

}
