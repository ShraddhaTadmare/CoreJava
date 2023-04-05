package com.SetExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Student> hs = new LinkedHashSet<>();
		
		hs.add(new Student(101,"Shraddha",89f));
		hs.add(new Student(102,"Sahili",99f));
		hs.add(new Student(103,"Snehal",79f));
		hs.add(new Student(104,"Shriniwas",69f));
		hs.add(new Student(104,"Shraddha",69f));
		
		Iterator<Student> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			

	}

}
