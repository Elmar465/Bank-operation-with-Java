package project1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		String[] banks = { "Kapital bank", "Xalq Bank", "ABB" };
		for (int i = 0; i < banks.length; i++) {
			System.out.println(i + ":" + banks[i]);
		}
		Scanner i = new Scanner(System.in);
		System.out.print("Bankin adini secin: ");
		String name = i.nextLine();

		if (name.equals("Kapital Bank")) {
			String[] operationType = { "cash", "credit" };
			for (int k = 0; k < operationType.length; k++) {
				System.out.println(k + ":" + operationType[k]);
			}
			System.out.print("Emeliyyat novunu secin: ");
			String type = i.nextLine();
			if (type.equals("cash")) {
				System.out.print("Meblegi qeyd edin : ");
				int amount = i.nextInt();
				if (amount <= 1000) {
					System.out.print("Emeliyyat ugurla yerine yetirildi");
				} else {
					System.out.println("Max mebleg 1000 AZN den yuxari ola bilmez!");
				}
			} else if (type.equals("credit")) {
				System.out.print("Choose the credit limit: ");
				int creditLimit = i.nextInt();
				if (creditLimit < 5000) {
					System.out.print("Sorgunuz qeyde sizinle elaqe saxlanilacag");
				} else if (creditLimit > 5000) {
					System.out.println("5000 AZN den yuxari meblegler 13% hesablanir");
					System.out.println("odeyeceyiniz elave faiz " + (creditLimit * 13) / 100);
				} else {
					System.out.println("Error system");
				}
			}
		} else if (name.equals("Xalq Bank")) {
			String[] options = { "cash", "credit" };
			for (int a = 0; a < options.length; a++) {
				System.out.println(a + ":" + options[a]);
			}
			System.out.print("Xalq Banka xos gelmisiz Emeliyyat novunu secin : ");
			String type = i.nextLine();
			if (type.equals("cash")) {
				System.out.print("Meblegi qeyd edin :");
				int amount = i.nextInt();
				if (amount <= 1500) {
					System.out.print("Emeliyyat ugurla yerine yetirildi");
				} else {
					System.out.print("Max Mebleg 1500 AZN dan yuxari ola bilmez");
				}

			} else if (type.equals("credit")) {
				System.out.print("Goturmey istediyiniz kredit meblegin qeyd edin: ");
				int creditType = i.nextInt();
				switch (creditType) {
				case 3000:
					System.out.println("3000 AZN gore 9% faiz meblegin uzerine gelecek: ");
					System.out.println("Odeyeceyiniz mebleg: " + (creditType * 9) / 100);
					break;
				case 5000:
					System.out.println("5000 AZN gore odenilecek faiz 11% dir :");
					System.out.print("Faiz meblegi: " + (creditType * 11) / 100);
					break;
				case 10000:
					System.out.println("10000 AZN gore odenilecek faiz meblegi 15% dir");
					System.out.print("odenliecek faiz meblegi: " + (creditType * 15) / 100);
				default: {
					System.out.println("Error message");
				}
				}

			} else {
				System.out.println("Error");
			}
		} else if (name.equals("ABB")) {
			System.out.println("ABB Banka xos gelmisiz");
			String[] option = { "cash", "credit" };
			for (int q = 0; q < option.length; q++) {
				System.out.println(q + ":" + option[q]);
			}
			System.out.print("Emeliyyat novunu qeyd edin: ");
			String operation = i.nextLine();
			if(operation.equals("cash")) {
				System.out.print("Cekmek istediyiniz meblegi qeyd edin: ");
				int amount  = i.nextInt();
				if(amount < 2000) {
					System.out.println("Emeliyyat ugurla yerine yetirilmisdir");
				} else {
					System.out.println("Mebleg 2000 yuxari ola bilmez");
				}
			} else if(operation.equals("credit")) {
				System.out.print("Kredit meblegini qeyd edin: ");
				int creditLimit = i.nextInt();
				switch(creditLimit) {
				case 4000 :
					System.out.print("4000 AZN gore odeyeceyiniz faiz meblegi 13%\n");
					System.out.println("Faiz meblegi:" + (creditLimit*13)/100 + " AZN");
					break;
				case 6000 : 
					System.out.println("6000 AZN gore odeyeceyiniz elave faiz meblegi 15% dir.");
					System.out.println("Uzerine gelen elave faiz meblegi:" + (creditLimit*15)/100);
					break;
				case 8000 :
					System.out.println("8000 AZN gore odeyeceyiniz faiz meblegi 18& dir.");
					System.out.println("Elave olunan faiz meblegi:" + (creditLimit*18)/100);
					break;
				case 10000 :
					System.out.println("10000 AZN gore odeyeceyiniz faiz meblegi 20% dir.");
					System.out.println("Elave olunan faiz meblegi:" + (creditLimit*20)/100);
					
					default : {
						System.out.println(false);
					}
				}
			}
		}

	}
}
