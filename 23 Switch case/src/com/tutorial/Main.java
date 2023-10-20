package com.tutorial;

import java.util.*;

public class Main {

	//Switch case
	
	public static void main(String[] args) {
		
		String input;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("panggil nama: ");
		input = inputUser.next();
		
		//ekspersi berupa satuan (int,long,byte,short), String atau enum
		
		switch(input) {
			case "ujang":
				System.out.println("Saya Ujang dan hadir pak!!");
				break;
			case "agus":
				System.out.println("Saya Agus dan hadir pak!!");
				break;
			case "heri":
				System.out.println("Saya Heri dan hadir pak!!");
				break;
			default:
				System.out.println(input + " tidak hadir pak!!");
		
		}

		System.out.println("Selesai program");
		
	}

}