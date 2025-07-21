package com.controlflow;

public class DoWhile {
    //esegue almeno una volta il codice, poi controlla la condizione, se la condizione è vera, ripete, altrimenti si ferma
	
	
	
	public static void main(String[] args) {
		int i = 10;
		do {
		  System.out.println("i is " + i);
		  i++;
		} while (i < 1);
		// Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.
		
		int numero = 1; 
		
		do {
			System.out.println(numero+ " ");
			numero++;
			
		} while(numero<=10);
		
		System.out.println("------------");
		
		int n = 10;
		do {
			System.out.println(n + " ");
			n--;
		} while (n>=0);
		
		System.out.println("------------");
		
		
		int b = 12;
		do {
			System.out.println(b +" ");
			b = b-2;
		} while (b>=2);
		
		System.out.println("------------");
		
		//Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
		int c= 1;
		int s = 0;
		do { s += c;
		c++;
			
		} while (c<=100);
		System.out.println("somma:"+ s);
		
		System.out.println("------------");
		
		//Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5.
		
		int moltiplicatore = 10;
		
		do { int prodotto=moltiplicatore*5;
		System.out.println(prodotto);
		moltiplicatore= moltiplicatore-1;
		
		}while (moltiplicatore >= 1);
		
		System.out.println("------------");
		
		int j = 1;
		do { int k = j *5;
		System.out.println(k);
		j = j+1;
		} while (j <= 10);
		
		
		
		
		

	}

}
