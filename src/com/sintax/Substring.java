package com.sintax;

public class Substring {

	public static void main(String[] args) {
		
		String s = "CiaoMondo";
	
		String risultato = s.substring(0, 4);
		
		System.out.println(risultato);
		
		
		
		
		String txt2 = "RobertaPorfidoNataATriggiano";
		//////////////"0123456789";
		//////////////"123456789"
		System.out.println("Substring solo begin:" + txt2.substring(4));
		System.out.println("Substring usando indice 0:" + txt2.substring(0));
		System.out.println("Substring usando indice 1:" + txt2.substring(1));
		System.out.println("Substring begin/end:" + txt2.substring(2,7));
		
		
		
		
		
		
				
	}
	

	
}
