package com.controlflow;

public class CicliEsercizioTre {

	public static void main(String[] args) {
		
	 char x = 'a';
	 if (x== 'a'|| x== 'e'|| x=='i'|| x=='o'|| x=='u') {
		 System.out.println("è una vocale");
	 }else {
		 System.out.println("è una consonante");
	 }
	 
	 System.out.println("----------------");
	 
	 int numero = 4;
		if (numero % 2 == 0) {
			System.out.println("pari");
		}else {
			System.out.println("dispari");
		}
		
		 System.out.println("----------------");
		 
		 int num1 = 3;
		 int num2 = 3;
		 if (num1==num2) {
			 System.out.println("i numeri sono uguali");
		 }else {
			 System.out.println("i numeri non sono uguali");
		 }
		 
		 System.out.println("----------------");
		 
		 int a = 18;
		 int b = 18;
		 if (a > b) { 
			 System.out.println("il numero maggiore è" + a);
		 } else if(b > a) {
			 System.out.println("il numero maggiore è" + b);
		 }else {
			 System.out.println("i numeri sono uguali");
		 
		 }
		 
		 System.out.println("----------------");
		 
		  String ciclo = "";
		  if (ciclo.isEmpty()) {
			  System.out.println("la stringa è vuota");
		  }
		  else {
			  System.out.println("la stringa non è vuota"+" "+ciclo); 
			 
		  } 
		  
		  System.out.println("----------------");
		  
		  int anno = 2025;
		  if ((anno%4==0 && anno%100 !=0)||(anno % 400== 0)) {
			  System.out.println("anno bisestile");
		  }else {
			  System.out.println("anno non bisestile" + " "+ anno);
		  }
		  
		  System.out.println("----------------");
		  
		  int n2 = 99;
		  if (n2%2==0 && n2%3==0) {
			  System.out.println("numero divisibile sia per 2 che per 3");
		  } else if (n2%2==0) {
			  System.out.println("numero divisibile solo per 2 ma non per 3");
		  } else if (n2%2!=0) {
				  System.out.println("numero divisibile solo per 3 ma non per 2");
		  } else {
			  System.out.println("numero non divisibile ne per 2 ne per 3");
		  }
		  
		  System.out.println("----------------");	  
		  
		  double prezzo = 650.00;
	        double sconto = 0.0;
	        
	        if(prezzo > 500) {
	        	sconto = 0.20;
	        }else if(prezzo > 100) {
	        	sconto = 0.10;
	        }
	        
	        double importosconto = prezzo * sconto;
	        double prezzofinale = prezzo - sconto;
	        
	        System.out.println("=== CALCOLO SCONTO ===");
	        System.out.println("Prezzo iniziale: €" + prezzo);
	        System.out.println("Percentuale sconto: " + sconto);
	        
            System.out.println("=== CALCOLO SCONTO ===");
	        System.out.println("Prezzo iniziale: €" + prezzo);
	        System.out.println("Percentuale sconto: " + sconto);
	        System.out.println("Importo sconto: €" + importosconto);
	        System.out.println("Prezzo finale: €" + prezzofinale);
	        System.out.println("Risparmio: €" + importosconto);
	        
	        System.out.println("----------------");	  
	        
	        int k = 7;
	        if (k ==9 || k==10) {
	        	System.out.println("ottimo");
	        }else if (k==7 && k==8) {
	           System.out.println("buono");
	        }else if (k==6) {
	 	       System.out.println("sufficiente");
	        }else{
	 	       System.out.println("insufficiente");
	        }
	        
	        System.out.println("----------------");	  
	        
	        
	      
	        int daytime = 12;
			if(daytime >= 6 && daytime <= 12) {
				System.out.println("Mattina");
			}else if (daytime > 12 && daytime <= 18 ) {
				System.out.println("Pomeriggio");
			}else if (daytime > 18 && daytime <= 24) {
				System.out.println("Sera");
			}else if (daytime >= 0 && daytime < 6){
				System.out.println("Notte");
			}else {
				System.out.println("Non hai inserito un orario 0-24 valido!");
			}
	        
	        
	       
	        	
		 
		  
		  
		  		
		 

	}
}


