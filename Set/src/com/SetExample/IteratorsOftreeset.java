package com.SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class IteratorsOftreeset {

	public static void main(String[] args) {
      HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("Python");
		hs.add("Java");
		hs.add("Angular");
		hs.add("Angular");
		
       Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
