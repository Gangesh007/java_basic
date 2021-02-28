package javabasics;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	public static void test(){
		try {
			System.out.println("method1");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
			// TODO: handle exception
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
