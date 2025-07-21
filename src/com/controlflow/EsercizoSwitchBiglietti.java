package com.controlflow;

public class EsercizoSwitchBiglietti {

	public static void main(String[] args) {
		
		int age= 9;
		
		String ticket= "";
		
		if (age>=0 && age< 18) {
			ticket= "junior";
		}else if (age >= 18 && age<=65) {
			ticket= "adult";
		}else {
		ticket="senior"	;
		}
		
		switch (ticket) {
		case "junior":
			System.out.println("hai comprato un biglietto di tipo"+ " "+ticket);
			break;
		case "adult":
			System.out.println("hai comprato un biglietto di tipo"+ " "+ ticket);
			break;
		case "senior":
		System.out.println("hai comprato un biglietto di tipo"+" "+ ticket);
		}

	}

}
