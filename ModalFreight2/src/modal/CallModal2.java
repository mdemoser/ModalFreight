package modal;

import java.util.Scanner;

import modal.FreteModal.Country;

public class CallModal2 {

	Scanner scanner = new Scanner(System.in);
	public static double modalf;
	CallModal calMod = new CallModal();
	
	public double QuoteModal() {
		
		System.out.println("Type a modal transport Rail, Sea, Road, Air");
		String ModalStr = scanner.next();
		
		switch(ModalStr) {
		
		case "RAIL", "rail", "Rail","trem": 
		 if(CallModal.getMod().equals(Country.JAPAN) ||(CallModal.getMod().equals(Country.GERMANY))){//goods cannot come by rail
				System.out.println("Inapropriate modal transport");
				System.exit(0);
			}else {
			
				modalf = FreteModal.RAIL;
			}
		 break;
		 
		case "SEA","sea", "Sea", "marítimo":
			modalf = FreteModal.SEA;
		 break;
		 
		case "Road", "ROAD", "road", "rodoviário":
			if(CallModal.getMod().equals(Country.JAPAN) ||(CallModal.getMod().equals(Country.GERMANY))){// goods cannot come by road
				System.out.println("Inapropriate modal transport");
				System.exit(0);
			}else {
				modalf = FreteModal.ROAD;;
			}
		 break;
		 
		case "Air", "AIR", "air"," aéreo":
			modalf = FreteModal.AIR;
		break;
		}
		
		if (modalf == 0.0) {
			System.out.println("Wrong spelling, try again");    // message for the wrong spelling loop
		}
		return modalf;
		
	}
	
	
	
	public static double getModalf() {
		return modalf;
	}

	public void setModalf(double modalf) {
		this.modalf = modalf;
	}

	
	
}
