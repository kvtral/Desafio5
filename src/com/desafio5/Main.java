package com.desafio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc = 0; // opciones del menu, inicia en 0 para ingresar al while
		Scanner sc = new Scanner (System.in); // Objeto Scanner para leer desde consola

		while (opc != 5) {  // Mientras la opcion sea diferente de 5, seguira el programa
			System.out.println(); // Salto de linea
			System.out.println("************************");
			System.out.println("**        MENU        **");
			System.out.println("************************");
			System.out.println("1.- Ejercicio Visitas");
			System.out.println("2.- Ejercicio Smartwatch");
			System.out.println("3.- Ejercicio Multiplos de 3");
			System.out.println("4.- Ejercicio Promedios");
			System.out.println("5.- Salir");
			System.out.println();
			System.out.print("Ingrese Opción: ");
		
			do { // Seguira en el while hasta que se ingrese una opcion valida
			
				opc = Integer.parseInt(sc.nextLine());
				if (opc < 1 || opc > 5) System.out.print("Ingrese Opción válida: ");
			
			} while (opc < 1 || opc > 5);
		
			switch (opc){

        		case 1:{ // Ejercicio Visitas
        			System.out.print("Ingrese cantidad de dias a revisar : ");
        			int n = Integer.parseInt(sc.nextLine()); // Parametro que pasaremos al metodo
        		
        			Visitas vis = new Visitas (); // Objeto Visitas para llamar al metodo registroVisitas
        			float prom = vis.promedio(vis.registroVisitas(n)); // guardamos el return del metodo promedio
        		        		
        			System.out.println("El promedio de visitas de los últimos " + n + " dias es de: " + prom);
        		
        			break;
        		}
        		case 2:{ // Ejercicio Smartwatch
        			System.out.print("Ingrese cantidad de dias con pasos : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			Smartwatch smart = new Smartwatch (); // Objeto Smartwatch para llamar al metodo registroPasos       			
        			int prom = smart.promedio(smart.registroPasos(n)); // guardamos el return del metodo promedio
        		        		
        			System.out.println("El promedio de pasos válidos es de: " + prom); 
        		
        			break;
        		}
        		case 3:{ // Ejercicio Multiplos de 3
        			
        			System.out.print("Ingrese cantidad de números para Arreglo : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			MultiplosDeTres multiplo = new MultiplosDeTres ();   // Objeto MultiplosDeTres para llamar a los metodos de la clase     			
        			int sum = multiplo.sumaMultiplos(n); // guardamos el return del metodo sumaMultiplos con el parametro que recibimos
        			System.out.println();    		
        			System.out.println("La suma de los múltiplos de 3 es: " + sum); 
        		
        			break;
        		}
        		case 4:{ // Ejercicio Promedios
        			       		
        			System.out.print("Ingrese cantidad de números para Arreglo : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			MultiplosDeTres multiplo = new MultiplosDeTres ();  // Objeto MultiplosDeTres para llamar a los metodos de la clase      			
        			int sum = multiplo.sumaMultiplos(n); // guardamos el return del metodo sumaMultiplos con el parametro que recibimos
        			System.out.println();
        			System.out.println("La cantidad de múltiplos de 3 es: " + multiplo.cont); // imprimimos la variable cont del objeto
        			System.out.println("El promedio de los múltiplos de 3 es: " + (sum/multiplo.cont)); 
        		
        			break;
        		}
        		
        		default: { // Si la opcion es 5, se sale del programa
        			System.out.println("Saliendo ...");
					sc.close(); // Cerramos el objeto Scanner
        		}

			}
		
		}
		
	}
	
	

}
