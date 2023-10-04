package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("X");
		
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		
		ArrayList bl = new ArrayList();
		
		
		bl.addAll(al);
		
		System.out.println(al);
		
		System.out.println(bl);
		
		
		bl.removeAll(bl);
		
		
		System.out.println(bl);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println("Elements in Array List in reverse order: "+al);
		
		Collections.shuffle(al);
		
		System.out.println("Elements in Array List after shuffling: "+al);
		
		

	}

}
