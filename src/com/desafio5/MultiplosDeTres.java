package com.desafio5;

import java.util.ArrayList;
import java.util.Random;

public class MultiplosDeTres { 
	ArrayList<Integer> num = new ArrayList<Integer>(); // ArrayList para guardar los números
	Random random = new Random(); // Objeto Random para generar números aleatorios
	int suma = 0; 
	int cont = 0; // Variable para contar los multiplos de 3 (Ejericio 4)

    public int sumaMultiplos (int n)    { // Metodo para sumar los números multiplos de 3 con argumento recibido
   	
    	System.out.println("Numeros en Array: ");
    	for (int i=0; i < n; i ++) {    		
    		num.add(random.nextInt(100 + 1) + 1); // Agregamos números aleatorios al ArrayList
    		System.out.print(num.get(i) + " |"); // Imprimimos los números
    		if (num.get(i) % 3 == 0) { // Si el número es multiplo de 3
    			suma += num.get(i);    
    			cont += 1;	
    		}
    	}
    	
    	return(suma); // Retornamos la suma
    }
    
	
}
