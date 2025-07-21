package com.controlflow;

public class EserciziSwitch {

	public static void main(String[] args) {
		
		
		int scelta= 2;
		switch(scelta) {
		case 1: 
			System.out.println("ceasar salad");
			break;
		case 2:
			System.out.println("spaghetti alla carbonara");
			break;
		case 3:
			System.out.println("pizza margherita");
			break;
			
			default:
				System.out.println(scelta);
			}
		
		System.out.println("-------------");
		
		int daytime = 4;
		switch(daytime) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Mattina");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("Pomeriggio");
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
			System.out.println("Sera");
			break;
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Notte");
			break;
		default:
			System.out.println("daytime");
		
		
		}
		
		System.out.println("-------------");
		
		/* 
		 * USA UNO SWITCH PER STAMPARE IL NOME DEL MESE  E CON IF STAMPA SE HA 31 O 30 GIORNI
		 */
		
		int numeroMese = 7; 
        String nomeMese = "";
        
        switch (numeroMese) {
            case 1:
                nomeMese = "Gennaio";
                break;
            case 2:
                nomeMese = "Febbraio";
                break;
            case 3:
                nomeMese = "Marzo";
                break;
            case 4:
                nomeMese = "Aprile";
                break;
            case 5:
                nomeMese = "Maggio";
                break;
            case 6:
                nomeMese = "Giugno";
                break;
            case 7:
                nomeMese = "Luglio";
                break;
            case 8:
                nomeMese = "Agosto";
                break;
            case 9:
                nomeMese = "Settembre";
                break;
            case 10:
                nomeMese = "Ottobre";
                break;
            case 11:
                nomeMese = "Novembre";
                break;
            case 12:
                nomeMese = "Dicembre";
                break;
            default:
                nomeMese = "Mese non valido";
        }
        
        System.out.println("Il mese è: " + nomeMese);
      
        if (numeroMese == 1 || numeroMese == 3 || numeroMese == 5 || 
            numeroMese == 7 || numeroMese == 8 || numeroMese == 10 || 
            numeroMese == 12) {
            System.out.println(nomeMese + " ha 31 giorni");
        } else if (numeroMese == 4 || numeroMese == 6 || 
                   numeroMese == 9 || numeroMese == 11) {
            System.out.println(nomeMese + " ha 30 giorni");
        } else if (numeroMese == 2) {
            System.out.println(nomeMese + " ha 28 giorni");
        } else {
            System.out.println("Numero mese non valido");
        }
		


	
	}

}
