package com.controlflow;

public class CalcolatriceSwitch {

	public static void main(String[] args) {
		
		char operatore = '*';
		int num1 = 5;
		int num2 = 52;
		switch (operatore) {
		case '+':
			System.out.println(num1+ num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '/':
			System.out.println(num1/num2);
			if (num1!=0) {
			}else { 
			System.out.println("numero non valido");
			}
		case '*':
			System.out.println(num1 * num2);
			break;
			
			default:
				System.out.println("öperazione non valida");
			
			
			
		}
		
		

	}

}
