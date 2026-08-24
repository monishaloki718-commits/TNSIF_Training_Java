package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> fruits=new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon");
		
		System.out.println(fruits);
		
		System.out.println("First fruit : "+ fruits.get(0));
		
		System.out.println(fruits);
		
		fruits.set(1, "Cherry");
		
		System.out.println(fruits);
		
		fruits.remove(2);
		
		System.out.println(fruits);
		
		if(fruits.contains("Apple"))
		{
			System.out.println("Apple is in the list");
		}
		else
		{
			System.out.println("Apple is not present in the list");
		}
		
		fruits.clear();
		
		System.out.println("list size "+fruits.size());
	}

}