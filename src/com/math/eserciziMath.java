package com.math;

public class eserciziMath {

	public static void main(String[] args) {
		 /*
		  System.out.println(Math.abs(-50));
	      System.out.println(Math.abs(Integer.MIN_VALUE));
	      System.out.println(Math.absExact(Integer.MIN_VALUE));
	      System.out.println(Math.abs((long) Integer.MIN_VALUE));

	      System.out.println("Max = " + Math.max(10, -10));
	      System.out.println("Min = " + Math.min(10.0000002, 10.001f));

	      System.out.println("Round Down = " + Math.round(10.2));
	      System.out.println("Round Up = " + Math.round(10.8));
	      System.out.println("Round ? = " + Math.round(10.5));

	      System.out.println("Floor = " + Math.floor(10.8));
	      System.out.println("Ceil = " + Math.ceil(10.2));

	      System.out.println("Square root of 100 = " + Math.sqrt(100)); 
	      System.out.println("2 to the third power (2*2*2) = " + Math.pow(2, 3));
	      System.out.println("10 to the fifth power (10*10*10*10*10) = " + Math.pow(10, 5));

	      for (int i = 0; i < 10; i++) {
	          System.out.println(Math.random());
	      }
	    
		// calcola la radice quadrata
		System.out.println("square root of 100="+ Math.sqrt(100));
		
		//calcola la potenza
		System.out.println("10 to the fifth power (10x10x10x10x10)=" + Math.pow(10, 5));
		
		//incremento numeri casuali sa 1 a 10
		for (int i = 0; i<10; i++) {
			System.out.println(Math.random());
		}
		
		//mantiene il numero intero evitando il decimale, non arrotonda
		
		System.out.println("Floor ="+ Math.floor(10.8));
		
		//arrotonda al numero intero
		
		System.out.println("Round Up=" + Math.round(10.8));
		System.out.println("round ?="+ Math.round(10.5));
		System.out.println("ceil="+ Math.ceil(10.2));*/

	  
		//dato un numero intero stampa il suo valore assoluto
		int numeroIntero= -27;
		int valoreAssoluto= Math.abs(numeroIntero);
		System.out.println("il valore assoluto di" + " "+ numeroIntero + " "+ "è"+ " " + valoreAssoluto);
		
		System.out.println("--------------");
		
		// calcola 2 elevato alla 5
		System.out.println("il risultato è" + " "+ Math.pow(2, 5));
		
		System.out.println("--------------");
		
		//trova la radice quadrata di 49
		
		System.out.println("il valore è"+" "+ Math.sqrt(49));
		System.out.println("--------------");
		
		//arrotonda il numero 3.6
		
		System.out.println("il risultato è"+ " "+ Math.round(3.6));
		System.out.println("--------------");
		
		//stampa il maggiore tra due numeri interi
		
		
		System.out.println(Math.max(56, 36));
		System.out.println("--------------");
		
		//stampa il minore tra due numeri interi
		
		System.out.println(Math.min(23, 45));
		
		int min = Math.min(89, 90);
		System.out.println(min);
		System.out.println("--------------");
		
		//stampa numero casuale tra 0 e 5
		
		double casual = Math.random()*5;
				System.out.println("numero casuale" + " "+ casual);
				System.out.println("--------------");
		
				
		//stampa un numero intero random tra 1 e 10
		int num =(int) (Math.random()*10) + 1;
		System.out.println(num);
		

		//differenza assoluta tra 20 e 35
		
		int alpha = 20;
		int beta = 35;
		int gamma = Math.abs(alpha-beta);
		System.out.println("la differenza assoluta tra" + " "+ alpha + " e "+ beta + " = "+gamma);
		System.out.println("--------------");
		
		
		// stampa il floor e il ceil di 3.7
		
		double a = 3.7;
		System.out.println(Math.floor(a));
		System.out.println("--------------");
		
		double b = 3.7;
		System.out.println(Math.ceil(b));
		System.out.println("--------------");
		
		// Dati i cateti a = 3 e b = 4, calcola l’ipotenusa usando il teorema di Pitagora.
		
		double c = 3;
		double d = 4;
		
		double sommaQuadrati = Math.pow(c, 2) + Math.pow(d,2);
		
		double ipotenusa = Math.sqrt(sommaQuadrati);
		
		System.out.println(ipotenusa);
		System.out.println("--------------");
		
		// genera un numero casuale tra 1 e 6
		
		int numCasuale = (int)( Math.random()*6)+1;
		System.out.println("il numero casuale è "+ numCasuale);
		System.out.println("--------------");
		
		//dato il raggio r =5 calcola l`area del cerchio (r*pi greco)
		
		double raggio = 5;
		double raggioQuadrato = Math.pow(raggio, 2);
		double areaCerchio = Math.PI*raggioQuadrato;
		System.out.println("l`area del cerchio è "+ Math.ceil(areaCerchio));
		System.out.println("--------------");
		
		//stampa un numero casuale tra 0.00 e 1.00 con due cifre decimali
		
	    double numbersss = Math.round(Math.random()* 100/100.0);
	    System.out.println(numbersss);

	}

}
