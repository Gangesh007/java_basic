package javabasics;

public class TwoDinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String x[][]=new String[3][5];
     x[0][0]="A1";
     x[0][1]="B1";
     x[0][2]="C1";
     x[0][3]="D1";
     x[0][4]="E1";
     System.out.println(x.length);//row
     System.out.println(x[0].length);//coloumn
     x[1][0]="A2";
     x[1][1]="B2";
     x[1][2]="C3";
     x[1][3]="D4";
     x[1][4]="E5";
     
     for (int r = 0; r<x.length; r++) {
    	 for (int c = 0; c<x[0].length; c++) {
    		 System.out.println(x[r][c]);
			
		}
		
	}
        
	}

}
