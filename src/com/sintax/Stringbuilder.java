package com.sintax;

public class Stringbuilder {

	public static void main(String[] args) {
		
		StringBuilder testo4 = new StringBuilder ("Il mio film preferito è");
		testo4.append(" La Città Incantata.");
		testo4.append(" Penso sia il capolavoro dell`animazione giapponese.");
		testo4.append(" E il tuo qual è?");
		System.out.println(testo4);
		
		
		StringBuilder testo3 = new StringBuilder ("La mia serie tv preferita è");
		testo3.append(" Breaking Bad.");
		System.out.println(testo3);
		
		
		StringBuilder color = new StringBuilder ("red");
		color.insert(1, "blue");
		System.out.println(color);
		
		StringBuilder car = new StringBuilder ("Porsche");
		car.delete(1,3);
		System.out.println(car);
		
		StringBuilder football = new StringBuilder ("football");
		football.reverse();
		System.out.println(football);
		
		StringBuilder name = new StringBuilder ("Simone");
		name.replace(0, 1, "L");
		System.out.println(name);
		
		StringBuilder anna = new StringBuilder ("anna");
		anna.reverse();
		System.out.println(anna);
	

	}

}
