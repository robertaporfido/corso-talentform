package com.controlflow;



public class CicloFor {

	public static void main(String[] args) {
		
	int num = 1234;
	int numReverse = 0;
	while ( num > 0) {
		int restoDivisione = num % 10; //è un`operazione
		numReverse = (numReverse * 10) + restoDivisione;
		num = num/10;
	}
	System.out.println(numReverse);
	
	System.out.println("------------");
	
	
	int numDiviso = 12;
	int numList = 1;
	
	while (numList<= numDiviso){
		if (numDiviso % numList == 0) {
			System.out.println(numList+ " ");
		} numList++;
		
	}
	
	System.out.println("------------");
	
	
	
	
	
	
	

	
	
	
	
	
	
	}

}
