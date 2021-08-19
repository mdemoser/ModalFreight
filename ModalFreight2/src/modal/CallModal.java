package modal;

import java.util.Scanner;

import modal.FreteModal.Country;

public class CallModal {
	
	static FreteModal.Country mod;
	
	
	
	public Country Quote() {
	System.out.printf("Tipe a country origin between Japan, USA, Germany, Chile\n");
	Scanner scanner = new Scanner(System.in);

	String FCoun = scanner.next(); //choose the country origin
	
	switch(FCoun) {
	
	case "JAPAN", "Japan", "japan":
		mod = FreteModal.Country.JAPAN;
		break;
	
	case "USA", "EUA", "United Stades", "Estados Unidos":
		mod = FreteModal.Country.USA;
	    break;
		
	case "Germany", "GERMANY", "germany", "Alemanha":
		mod = FreteModal.Country.GERMANY;
		break;
		
	case "CHILE", "Chile", "chile":
		mod = FreteModal.Country.CHILE;
		break;
	}	
	if (mod == null) {
		System.out.println("Wrong spelling, try again");
	}
		return mod;
		
		
		
	}


	public static FreteModal.Country getMod() {
		return mod;
	}


	public void setMod(FreteModal.Country mod) {
		this.mod = mod;
	}
	
	
	
	}

	

