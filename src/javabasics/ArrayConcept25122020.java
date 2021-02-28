package javabasics;



public class ArrayConcept25122020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array
		int i[]= new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		//size of the array
		System.out.println(i.length);
		//print all the array
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		
		//char array
		
		char c[]=new char[3];
		c[0]='j';
		c[1]='k';
		c[2]='d';
		
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
		//string array
		String s[]=new String[3];
		s[0]="jf";
		s[1]="jjkok";
		s[2]="jjjhygydhjd";
		
		for (int r = 0; r < s.length; r++) {
			System.out.println(s[r]);
		}
		
		//object array
		Object obj[]= new Object[3];
		obj[0]='d';
		obj[1]=19;
		obj[2]="ndjndje";
		
		System.out.println(obj[2]);
		
		for (int ob = 0; ob < obj.length; ob++) {
			System.out.println(obj[ob]);
		}
		
		
	}

}
