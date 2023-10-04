package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("Pranab");
		al.add('P');
		al.add(12.5);
		al.add(true);
		
		System.out.println(al);
		System.out.println("Number of elements in Array List: "+al.size());
		
		al.remove(3);
		
		System.out.println("Elements present in Array List after removing: "+al);
		
		System.out.println("Size of array list after removing: "+al.size());
		
		
		al.add(2,"Mandya");
		
		System.out.println("After insertion in Array List: "+al);
		System.out.println("Size of Array List after insertion: "+al.size());

		
		//al.get(2);
		
		System.out.println(al.get(2));
		
		al.set(2, "Ashok Nagar");
		
		System.out.println("After replacing with new element: "+al);
		
		//al.contains("Ashok Nagar");
		
		System.out.println(al.contains("Ashok Nagar"));
		
		System.out.println(al.contains("Ashok"));
		
		
		System.out.println(al.isEmpty());
		
		
		System.out.println("Reading the elements of Array List");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("Reading Elements using For Each Loop ");
		
		for(Object i:al)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("Reading Elements using Iterator method");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
		
		
		
		
	}

}
