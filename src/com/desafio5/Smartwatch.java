package com.desafio5;

import java.util.ArrayList;
import java.util.Random;

public class Smartwatch {
	
	Random random = new Random();
	
    public ArrayList<Integer> registroPasos(int n)    {
    	ArrayList<Integer> pasos = new ArrayList<Integer>();
    	
    	for (int i=0; i < n; i ++) {    		
    		pasos.add(random.nextInt(500000 + 1) + 1);
    	}
    	  	
    	for (int i=0; i < pasos.size(); i ++) {
    		if (pasos.get(i)>100000 || pasos.get(i)<200) {
    			System.out.println("dia " + (i+1) + " fuera de rango: " + pasos.get(i));
    			System.out.println("dia " + (i+1) + " eliminado ...");
    			pasos.remove(i);
    		}
    	}
    	return(pasos);
    }
    
	public int promedio (ArrayList<Integer> arr) {
		int promedio = 0;

    	for (int i=0; i < arr.size(); i ++) {
    		System.out.println("Pasos del dia " + (i+1) + " : " + arr.get(i));
    		promedio += arr.get(i);
    	}

		return promedio / arr.size() ;
	}
	
}
