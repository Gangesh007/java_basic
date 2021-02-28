package javaoopsconcept;

public class MethodOverloadingConcept {
	//JVM will try to search with this main method-->public static void 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.sum();
		obj.sum(10);
		obj.sum(12.55);
		obj.sum(23, 4);
		main(10);
		main(20,89);
	}

	//Can we overload main method ==>Yes we can overload main method
	public static void main(int p) {
		System.out.println("main mrthod -->one input parameter");
	}
	public static void main(int q, int r) {
		System.out.println("main mrthod -->2 input parameter");
	}

	//can not create method inside a method
	//duplicate method with same method name with same number argument are not allowed
	//Method overloading==>when method name is same with different argument or input parameters with different data types within the same class
	public void sum(){
		System.out.println("Zero parameter");

	}

	public void sum(int i){
		System.out.println("One Input parameter");
		System.out.println(i);
	}
	public void sum(double d){
		System.out.println("One Input parameter");
		System.out.println(d);
	}
	public void sum(int k,int j){
		System.out.println("Two input parameter");
		System.out.println(k+j);

	}
}
