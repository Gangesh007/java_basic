package javaoopsconcept;

public class CallByValueReferenceConcept {
	int p;
	int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueReferenceConcept obj=new CallByValueReferenceConcept();
		int x=10;
		int y=20;
		obj.testSum(x, y);//Call bu value or pass by value==>copy of x and y given to a and b not original value
		obj.p=60;
		obj.q=90;
		
		//call by reference variable
		obj.swap(obj);
		//after swapping
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testSum(int a, int b){
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
//value of obj given to t, t is also referring to particular object
	public void swap(CallByValueReferenceConcept t){
		int temp;
		temp=t.p;//60
		t.p=t.q;//90
		t.q=temp;//60
	}

}
