package modal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modal.FreteModal.Country;

public class FreigthStatus {
	
	Date dateS;
	
	public void CheckStatus() {
		
		
	     System.out.println("\n\nType the purchase date");
	     Scanner scanner = new Scanner(System.in);
	     String dateStr = scanner.next();
	    
	     
	     
	     if((CallModal.getMod().equals(Country.JAPAN) && (CallModal2.getModalf() == (FreteModal.AIR)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(9); //from Japan by Air it takes 9 days
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){    //calculate today's freight status
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) { //if today is in between three days for clear status
	    		System.out.println("Freight status custom warehouse");						//the goods are in custom warehouse.						
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	    	
	    	
	    	
	    }
	     
	     else if((CallModal.getMod().equals(Country.JAPAN) && (CallModal2.getModalf() == (FreteModal.SEA)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(64); //from Japan by sea it takes 64 days
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.GERMANY) && (CallModal2.getModalf() == (FreteModal.AIR)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(6);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.GERMANY) && (CallModal2.getModalf() == (FreteModal.SEA)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(47);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.CHILE) && (CallModal2.getModalf() == (FreteModal.AIR)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(3);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.CHILE) && (CallModal2.getModalf() == (FreteModal.SEA)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(27);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.CHILE) && (CallModal2.getModalf() == (FreteModal.RAIL)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(5);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.CHILE) && (CallModal2.getModalf() == (FreteModal.ROAD)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(8);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.USA) && (CallModal2.getModalf() == (FreteModal.AIR)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(4);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.USA) && (CallModal2.getModalf() == (FreteModal.RAIL)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(50);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.USA) && (CallModal2.getModalf() == (FreteModal.SEA)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(25);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	     
	     else if((CallModal.getMod().equals(Country.USA) && (CallModal2.getModalf() == (FreteModal.ROAD)))){
	    	 
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localdate = LocalDate.parse(dateStr, formatter);
	    LocalDate arrival = localdate.plusDays(26);
	    String arrivalformat = arrival.format(formatter);
	    LocalDate today = LocalDate.now();
	    	if (arrival.isAfter(today)) {
	    		System.out.println("Your goods will arrive in " + arrivalformat);
	    	}else {
	    		System.out.println("Your goods arrived in " + arrivalformat);
	    	}
	    	
	    	if((today.isAfter(localdate) && (today.isBefore(arrival.minusDays(3))))){
	    		System.out.println("Freight status on board");
	    	}
	    	else if((today.isAfter(arrival.minusDays(4)) && (today.isBefore(arrival)))) {
	    		System.out.println("Freight status custom wearhouse");
	    	}
	    	else if((today.isAfter(arrival)) || (today.isEqual(arrival))) {
	    		System.out.println("Freight status clear");
	    	}
	    	else if (today.isBefore(localdate)) {
	    		System.out.println("waiting invoice payment");
	    	}
	     }
	}

}
