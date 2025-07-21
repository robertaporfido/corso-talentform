package com.array;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ArrayIntro {

	public static void main(String[] args) {
//		int[]numeri = new int[7];
//		numeri[0]=100;
//		numeri[1]=90;
//		numeri[2]=80;
//		numeri[3]=70;
//		numeri[4]=60;
//		numeri[5]=50;
//		numeri[6]=40;
//		
//		int lunghezza = numeri.length;
//		System.out.println("lunghezza array: "+ lunghezza);
//		
//		for(int i=0;i<lunghezza;i++) {
//			
//		System.out.println(i);
//		}
//		
//		System.out.println("------------------");
//		
//		int[] arrayNumerix = {16,13,29,79,81,100};
//		for (int in : arrayNumerix) {
//			System.out.println(in);
//			}
//		
//		String[]arrayString = new String [3];
//		arrayString[0] = "Ciao";
//		arrayString[1] = "come stai oggi? ";
//		arrayString[2] = "ieri eri sciupato";
//		System.out.println(arrayString[1]);
//		
//
//    	System.out.println("------------------");
//		
//		
//		int lun = arrayString.length;
//		System.out.println("lunghezza array di stringhe: "+ lun);
//		
//		System.out.println("------------------");
//		
//		for (int i = 0; i < arrayString.length; i++) {
//			
//			System.out.println(arrayString[i]);
//			
//		}
//		System.out.println("------------------");
//		
//		String[]str = {"oggi ", "studiamo ","gli array"};
//		for (String index : str) {
//			System.out.print(index);
//	    }
		
 //     Crea un array di interi e stampane ogni elemento.
		
		int[] numero = new int[5];
		numero[0] = 45;
		numero[1] = 65;
		numero[2] = 76;
		numero[3] = 54;
		numero[4] = 23;
		
		
		for (int num = 0; num<numero.length; num++) {
			System.out.println(numero[num]);
		}
		
//		Crea un array di stringhe e stampane ogni elemento.
		
		String[] giochi = new String[3];
		giochi[0] = "the witcher";
		giochi[1] = "league of legends";
		giochi[2] = "exp33";
		
		
		for (int giocoDiOggi= 0; giocoDiOggi < giochi.length; giocoDiOggi++) {
			System.out.println("oggi giocherò a "+ giochi[giocoDiOggi]);
			
		}
		
		System.out.println("------------------");
//      Calcola la somma di tutti gli elementi di un array.
		
        int[] numeri = new int[5]; //crea un array vuoto di 5 posti
		
		numeri[0] = 1;
		numeri[1] = 10;
		numeri[2] = 24;
		numeri[3] = 6;
		numeri[4] = 2;
		
		int somma = 0; //inizializa la somma
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.print(numeri[i] + " "); //stampa ogni elemento dell array
			somma = somma + numeri[i]; //aggiorna la somma
		}
		
		System.out.println();
		
        System.out.println("La somma degli elementi del Array è: " + somma);
        
       //Dato un array, calcola la differenza tra il valore massimo e minimo.
        
        int[] array = {7, 2, 10, 4, 6};

        // Inizializza min e max con il primo elemento dell'array
        int min = array[0];
        int max = array[0];

        // Scorri l'array per trovare min e max
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int differenza = max - min;
        System.out.println("Differenza tra max e min: " + differenza);
        
        //Scrivi un programma che trova la posizione del numero 9 nell’array.
        
        int[] listaAr = { 5, 9, 8, 67, 5 };
		int numCer = 9;
		for (int i = 0; i < listaAr.length; i++) {
			if (listaAr[i] == numCer) {
				System.out.println("la posizione del num 9 è: " + i);
			}
		}
		//stampa numeri dispari 
		int []arrayOgg = new int [5];
		arrayOgg[0]=2;
		arrayOgg[1]=3;
        arrayOgg[2]=4;
        arrayOgg[3]=7;
        arrayOgg[4]=8;
        
        for (int i = 0; i < arrayOgg.length; i++) {
        	if(arrayOgg[i] %2!=0) {
        		System.out.println(arrayOgg[i]);
        	}
			
		}
        
        
        
        

		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
