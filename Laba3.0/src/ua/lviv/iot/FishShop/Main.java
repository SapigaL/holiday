package ua.lviv.iot.FishShop;

import java.util.List;
import ua.lviv.iot.FishShop.FishShop;
import ua.lviv.iot.FishShop.Fish;
import ua.lviv.iot.FishShop.Good;
import ua.lviv.iot.FishShop.Cavlar;
import ua.lviv.iot.FishShop.Stuffing;
import ua.lviv.iot.FishShop.FishType;
import java.util.Scanner;

public class Main {

	public static void printList(List<Good> goodList) {
		System.out.println(goodList);
	}

	public static void main(String[] args) {
		
		FishShop fishShoop = new FishShop("New York","Time Squear");
		//System.out.println("Hello World");
		fishShoop.addGood(new Fish(LocationType.SEA,30.5,40,"KARAS "));
		fishShoop.addGood(new Cavlar(LocationType.SEA,3.0,22,"ікра заморская   "));
		fishShoop.addGood(new Stuffing(LocationType.SEA,30.2,221,"фарш скумбрії  "));
		fishShoop.addGood(new Cavlar(LocationType.SEA,3.1,22,"ікра черная "));
				
		
		//printList(fishShoop.getGoodList());
		 Scanner in = new Scanner(System.in);
		 int b=0;
		 
		 System.out.println("MENU:\n 1.Вивід списку:\n 2.Сортування по енамах і вивід списку в ціновому діапазоні:\n 3.Сортування по вазі:");
		 b = in.nextInt();
		 while (b!=4) {
			
			 switch(b) {
		 case 1:
			 printList(fishShoop.getGoodList());
			 break;
	     case 2:
	    	 List<Good> result = fishShoop.findByGroup(FishType.FRIZE,Mixed.NO,ColorType.BLACK);
	    	 printList(fishShoop.findGoodByPrice(20,225, result));
		     break;
	     
	
		 case 3:
			 printList(fishShoop.sortByWeight(fishShoop.getGoodList()));
			 break;
		 }
			 System.out.println("MENU:\n 1.Вивід списку:\n 2.Сортування по енамах і вивід списку в ціновому діапазоні:\n 3.Сортування по вазі:");

			 b = in.nextInt();

		 
		 }

//	printList(fishShoop.getGoodList());
//		System.out.println("     ");
//		List<Good> result = fishShoop.findByGroup(FishType.FRIZE,Mixed.NONE,ColorType.BLACK);
//		printList(result);
//		printList(fishShoop.findGoodByPrice(20,22, result));
//		System.out.println("     ");
//		
//		System.out.println("     ");
//		printList(fishShoop.sortByWeight(fishShoop.getGoodList()));
//		



	}

}
