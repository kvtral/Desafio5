package com.desafio5;

import java.util.ArrayList;
import java.util.Random;

public class Visitas {
	
	ArrayList<String> a = new ArrayList<String>();
	Random random = new Random();
	
    public ArrayList<Integer> registroVisitas(int n)    {
    	ArrayList<Integer> visitas = new ArrayList<Integer>();
    	
    	for (int i=0; i < n; i ++) {    		
    		visitas.add(random.nextInt(5000 + 800) + 800);
    	}
   	
    	return(visitas);
    }
    
	public float promedio (ArrayList<Integer> arr) {
		float promedio = 0;
		
    	for (int i=0; i < arr.size(); i ++) {
    		System.out.println("visitas dia " + (i+1) + " : " + arr.get(i));
    		promedio += arr.get(i);
    	}
			
		return promedio / arr.size();
	}
	
}
