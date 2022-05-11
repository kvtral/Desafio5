package com.desafio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		Scanner sc = new Scanner (System.in);

		while (opc != 5) {
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
		
			do {
			
				opc = Integer.parseInt(sc.nextLine());
				if (opc < 1 || opc > 5) System.out.print("Ingrese Opción válida: ");
			
			} while (opc < 1 || opc > 5);
		
			switch (opc){

        		case 1:{
        			System.out.print("Ingrese cantidad de dias a revisar : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			Visitas vis = new Visitas ();
        			float prom = vis.promedio(vis.registroVisitas(n));
        		        		
        			System.out.println("El promedio de visitas de los últimos " + n + " dias es de: " + prom);
        		
        			break;
        		}
        		case 2:{
        			System.out.print("Ingrese cantidad de dias con pasos : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			Smartwatch smart = new Smartwatch ();        			
        			int prom = smart.promedio(smart.registroPasos(n));
        		        		
        			System.out.println("El promedio de pasos válidos es de: " + prom);
        		
        			break;
        		}
        		case 3:{
        			
        			System.out.print("Ingrese cantidad de números para Arreglo : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			MultiplosDeTres multiplo = new MultiplosDeTres ();        			
        			int sum = multiplo.sumaMultiplos(n);
        			System.out.println();    		
        			System.out.println("La suma de los múltiplos de 3 es: " + sum);
        		
        			break;
        		}
        		case 4:{
        			       		
        			System.out.print("Ingrese cantidad de números para Arreglo : ");
        			int n = Integer.parseInt(sc.nextLine());
        		
        			MultiplosDeTres multiplo = new MultiplosDeTres ();        			
        			int sum = multiplo.sumaMultiplos(n);
        			System.out.println();
        			System.out.println("La cantidad de múltiplos de 3 es: " + multiplo.cont);
        			System.out.println("El promedio de los múltiplos de 3 es: " + (sum/multiplo.cont));
        		
        			break;
        		}
        		
        		default: {
        			System.out.println("Saliendo ...");
					sc.close();
        		}

			}
		
		}
		
	}
	
	

}
