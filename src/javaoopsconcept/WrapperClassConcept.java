package javaoopsconcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="100";
		//To convert from string to integer
		System.out.println(x+20);
		
		//Integer is a wrapper class
		int a = Integer.parseInt(x);
		System.out.println(a+20);
		
		String y= "12.44";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
	    String k= "true";
	    boolean b = Boolean.parseBoolean(k);
	    System.out.println(b);
	    
	    int j=200;
	   String s = String.valueOf(j);
	   System.out.println(s+90);
	    
	   
	   String u ="100A";
	   Integer.parseInt(u);//throws Number Format Exception
	   
	   
	   
		
	}

}
