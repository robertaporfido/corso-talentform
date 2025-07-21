package com.controlflow;

public class Esercizio {

	public static void main(String[] args) {
		
		int giorno = 4;
		
		switch ( giorno ) {
		
		case 1: 
			System.out.println("è lunedì");
			break;
		case 2:
			System.out.println("è martedì");
			break;
		case 3:
			System.out.println("è mercoledì");
			break;
		case 4:
			System.out.println("è giovedì");
			break;
		case 5:
			System.out.println("è venerdì");
			break;
		case 6:
			System.out.println("è sabato");
			break;
		case 7: 
			System.out.println("è domenica");
				
		}
		
int day= 4; 
		
		if (day > 1 && day < 5) {
			  System.out.println("é un giorno feriale");
		} else if (day == 6 && day == 7) {
		      System.out.println("è il fine settimana");
		}
		
int d = 4;
		 if (d == 3) {
			 System.out.println("è mercoledì");
		} else {	
			System.out.println("no, non è mercoledì");}

	}
	
}