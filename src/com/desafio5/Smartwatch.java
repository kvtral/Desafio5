package com.desafio5;

import java.util.ArrayList;
import java.util.Random;

public class Smartwatch {
	
	Random random = new Random(); // Objeto Random para generar números aleatorios
	
    public ArrayList<Integer> registroPasos(int n)    {
    	ArrayList<Integer> pasos = new ArrayList<Integer>(); // ArrayList para guardar los números
    	
    	for (int i=0; i < n; i ++) {    		
    		pasos.add(random.nextInt(500000 + 1) + 1); // Agregamos números aleatorios al ArrayList en un for hasta completar n recibido
    	}
    	  	
    	for (int i=0; i < pasos.size(); i ++) {
    		if (pasos.get(i)>100000 || pasos.get(i)<200) { // Si el número es mayor a 100000 o menor a 200
    			System.out.println("dia " + (i+1) + " fuera de rango: " + pasos.get(i));
    			System.out.println("dia " + (i+1) + " eliminado ...");
    			pasos.remove(i); // Eliminamos el índice del ArrayList
    		}
    	}
    	return(pasos); // Retornamos el ArrayList
    }
    
	public int promedio (ArrayList<Integer> arr) { // recibe un ArrayList, retorna el promedio
		int promedio = 0;

    	for (int i=0; i < arr.size(); i ++) {
    		System.out.println("Pasos del dia " + (i+1) + " : " + arr.get(i));
    		promedio += arr.get(i); // Suma valor del indice actual
    	}

		return promedio / arr.size() ; // Retorna el promedio (sumatoria / tamaño del ArrayList)
	}
	
}
