package com.desafio5;

import java.util.ArrayList;
import java.util.Random;

public class MultiplosDeTres {
	ArrayList<Integer> num = new ArrayList<Integer>();
	Random random = new Random();
	int suma = 0;
	int cont = 0;

    public int sumaMultiplos (int n)    {
   	
    	System.out.println("Numeros en Array: ");
    	for (int i=0; i < n; i ++) {    		
    		num.add(random.nextInt(100 + 1) + 1);
    		System.out.print(num.get(i) + " |");
    		if (num.get(i) % 3 == 0) {
    			suma += num.get(i);
    			cont += 1;
    		}
    	}
    	
    	return(suma);
    }
    
	
}
