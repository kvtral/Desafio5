package com.desafio5;

import java.util.ArrayList;
import java.util.Random;

public class Visitas {
	
	Random random = new Random(); // Objeto Random para generar números aleatorios
	
    public ArrayList<Integer> registroVisitas(int n)    {
    	ArrayList<Integer> visitas = new ArrayList<Integer>(); // ArrayList para guardar las cantidades de visitas
    	
    	for (int i=0; i < n; i ++) {    		
    		visitas.add(random.nextInt(5000 + 800) + 800); // Agregamos números aleatorios al ArrayList en un for hasta completar n recibido
    	}
   	
    	return(visitas); // Retornamos el ArrayList
    }
    
	public float promedio (ArrayList<Integer> arr) { // recibe un ArrayList, retorna el promedio
		float promedio = 0;
		
    	for (int i=0; i < arr.size(); i ++) {
    		System.out.println("visitas dia " + (i+1) + " : " + arr.get(i));
    		promedio += arr.get(i); // Suma valor del indice actual
    	}
			
		return promedio / arr.size(); // Retorna el promedio (sumatoria / tamaño del ArrayList)
	}
	
}
