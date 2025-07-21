package com.controlflow;

public class IfElseJava {

	public static void main(String[] args) {
	
		//int day= 4; 
		
	//if (day > 1 && day < 5) {
			  //System.out.println("é un giorno feriale");
		//} else if (day == 6 && day == 7) {
		     // System.out.println("è il fine settimana");
		//}
		
		
		
		int a = 10;
        int b = 25;
        int c = 8;
        int d = 14;
        
        if (c > a) {
        	System.out.println("hai sbagliato ciuccio");
        } else if (b>a&&b>d) {
        	System.out.println("verissimo");
        } else if (b<d&&a<b) {
        	System.out.println("ma che stai dicendo");
        }
        
        System.out.println("---------------------");
        
        int e = 10;
        int f = 15;
        int g = 34;
        int h = 22;
        
        if (e>f||e>g) {
        	System.out.println("nooooooo la polizia nooooo");
        } else if (g>f||h<f) {
        	System.out.println("TOP");
        }
        
        
        System.out.println("---------------------");
        
        String password = "12345";
        boolean passwordValida = password.length()>8;
        
        if (!passwordValida) {
            System.out.println("password troppo corta");
            System.out.println("non valida");
        } else {
        	System.out.println("password valida");
        	System.out.println("puoi accedere al sistema");
        }
        
        System.out.println("---------------------");
        
        boolean haOreo = true;
        boolean haLatte = false;
        boolean haCaffe = true;
        
        if (!haOreo&&!haCaffe) {
        	System.out.println("non puoi fare colazione completa");
        } else if (haOreo&&haCaffe) {
        	System.out.println("puoi fare colazione completa");
        	System.out.println("occhio agli sticker!");
        } else if (!haCaffe&&haLatte) {
        	System.out.println("chiamate la polizia");
      
        	
        }

        
        
        
       
       
        	
        
        	}
        	
       
        
        
        
        

 }
	

        

