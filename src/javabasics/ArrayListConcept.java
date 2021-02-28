package javabasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al.size());
		
        al.add(400);
        al.add(500);
        
        System.out.println(al.size());
        
        for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
        
        al.remove(2);
        System.out.println(al.size());
	}

}
