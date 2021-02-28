package exceptionhandlingconcept;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//used when we have to throw an exception deliberately or custom exception
		
		System.out.println("ABC");
		try {
			throw new Exception("Gangesh Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("PQR");
	}

}
