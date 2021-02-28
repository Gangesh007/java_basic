package javabasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable h = new Hashtable();
h.put("A", "Test");
h.put("B", "Hello");
h.put("C", "World");

System.out.println(h.size());

h.put(1, 100);
h.put(2, 120);

System.out.println(h.size());
System.out.println(h.get(2));

for (int i = 0; i < h.size(); i++) {
	System.out.println(h.get(i));
}

	}

}
