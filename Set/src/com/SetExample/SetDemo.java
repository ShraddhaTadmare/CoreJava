package com.SetExample;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("Python");
		hs.add("Java");
		hs.add("Angular");
		hs.add("Angular");
		
		Set<String> s = new HashSet<String>(hs);  
        System.out.println(s);  
		
		
		
		
		

	}

}
