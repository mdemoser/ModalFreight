package modal;

import java.util.Locale;
import java.util.Scanner;

import modal.FreteModal.Country;

public class FreteModal {
	
	
	 public static final double RAIL = 0.0006;   //kg km price
	 public static final double SEA = 0.00044;
	 public static final double AIR = 0.06;
	 public static final double ROAD = 0.002;
	
	 double price = 0;
	 double weight = 5;
	 
	 
public enum Country{	
	 USA(7740), // km from Brazil Santos
	 GERMANY(10300),
	 JAPAN(18600),
	 CHILE(3200);
	
	public int CountryOrigin;
	
	Country (int CountryOrigin){
		this.CountryOrigin = CountryOrigin;
	}
}
	 
	 
	
		 
	 
	 public void price_freight(Country mod, double m) {// parameters country(distance) and modal(price/kg/km)
		 Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		 	System.out.println("type the weight of the goods on kg");
		 	double kg = input.nextDouble();
		 
			 price = kg * mod.CountryOrigin * m;     //weight times distance km times modal index
		 
		 System.out.printf("The freight quote is R$ %.2f", price);
		 }
		 
	 
	
	 
	 public static void main(String[] args) {
		 CallModal calM = new CallModal();
		 FreteModal frM = new FreteModal();
		 CallModal2 Cm2 = new CallModal2();
		 FreigthStatus st = new FreigthStatus();
		 
		do {
		 calM.Quote();
		}while(calM.getMod() == null);       // wrong spelling loop
			 
		do {
		 Cm2.QuoteModal();
		}while(Cm2.getModalf() == 0.0);      //wrong spelling loop
		
		 frM.price_freight(calM.getMod(), Cm2.getModalf());
		 st.CheckStatus();
		 
		 
	}

}
