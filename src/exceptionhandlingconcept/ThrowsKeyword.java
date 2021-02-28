package exceptionhandlingconcept;

public class ThrowsKeyword {
	//Arithmetic exception taken care by JVM
	//1.div() will throw an exception 
	//2.sum() will throw an exception
	//3.main() will throw an exception
	//div()-->sum()-->throws
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		ThrowsKeyword t1=new ThrowsKeyword();
		t1.sum();
		System.out.println("ABC");
	}
	public void sum(){
		try {
			div();
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	public void div()throws ArithmeticException{
		int i=9/0; //exception linew
	}

}
