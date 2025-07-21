package com.eccezioni;

public class EserciziEccezioni {

	public static void main(String[] args) {
		
      try {
    	  int a = 5/0;
    	  System.out.println("risultato: "+ a);
      } catch (ArithmeticException e) {
    	  System.out.println("errore: il numero non si può dividere con 0");
    	  System.out.println(e.getMessage());
      } finally {
    	  System.out.println("exception eseguita");
      }
      
      System.out.println("-------------");
      
      String testo = "588";
      try {
    	  int cast = Integer.parseInt(testo);
    	  System.out.println(cast);
    	 
      }catch(NumberFormatException n){
    	System.out.println("formato non valido"); 
    	n.printStackTrace();
      }
      
      System.out.println("-------------");
      
      try {
    	  String[] elenco = {"a","b","c","d"};
    	  System.out.println(elenco[5]);
      }catch(Exception e) {
    	  System.out.println("Errore!");
    	  System.out.println(e.getMessage());
      }finally {
    	  System.out.println("Exception eseguita");
      }
      
      System.out.println("-------------");
      
      try  {
    	  String[] filmMarvel = { "Avengers", "Spiderman", "Deadpool"};
    	  System.out.println( filmMarvel[4]);
      }catch ( Exception d) {
    	  System.out.println("non è un film Marvel");
    	  System.out.println(d.getMessage());
      }finally {
    	  System.out.println("Exception Eseguita");
      }
      
      System.out.println("-------------");
      
//		In un array di stringhe, controlla se uno degli elementi è null e lancia NullPointerException
		
		String [] parole = {"parola1", null, "parola3"};
		try {
			for(String p : parole) {
			System.out.println(p.toUpperCase());
			}
		}catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}
		
//		Crea una variabile null e gestisci NullPointerException.
		
		
		
		try {
			String newVariabile = null;
			System.out.println(newVariabile.length());
		}catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}finally {
			System.out.println("ciao gianfranco sei bellissimo");
		}
      
      
      
      
	
	
	
	
	
	
	
	
	
	}

}
