package com.generation;

//Se importó el scanner
import java.util.Scanner;

public class Codigo4 {
	
	//Se añadió el método main
	//Se añadió en las condicionales if un else con el valor g=2
	public static void main(String[] args) {
		
		                     // se añadió system.in
		Scanner s = new Scanner(System.in);
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
	    //Scanner s2 = new Scanner();
	    
	    String j2 = s.nextLine();
	    
	    //Se quitó un paréntesis de más en la condición if
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijera")) { // se modificó por equals para homogeneizar
	            g = 1;
	          }  else {
		        g = 2;
		      }
	          break; //Se añadió el break

	        case "papel":
	          if (j2.equals("piedra")) { // se modificó por equals para homogeneizar
	            g = 1;
	          }  else {
			    g = 2;
			  }
	          break; //se añadió la llave de cierre y el break
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          } else {
	            g = 2;
	          }
	          break;
	          
	        default: {
	        	System.out.println("opción no válida");	
	        }
	        
	      }
	      System.out.println("Gana el jugador " + g);
	      
	      s.close(); //se cierra el scanner
	    }
	  		
	}
}


	
	
	
	

