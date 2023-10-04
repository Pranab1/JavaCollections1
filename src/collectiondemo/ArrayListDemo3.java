package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"Dog", "Cat", "Elephant"};
		
		for(String a:arr)
		{
			System.out.println(a);
		}
		
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
		
		

	}

}
