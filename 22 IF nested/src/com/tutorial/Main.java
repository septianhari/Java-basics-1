package com.tutorial;

public class Main {
	
	public static void main (String[] args){
		
	
		// Nested if bersarang
		
		int a = 5;
		int b = 10;
		
		System.out.println("ini awal program");
		
		if (a == 5) {
			
			if (b == 10){
				
				System.out.println("ini dimana a = 5 dan b = 10");
				
			} else {
				
				System.out.println(" ini dimana a = 5 b bukan 10");
				
			}
			
		} else {
			
			System.out.println(" ini dimana a salah");
			
		}
		
		System.out.println("ini akhir program");
	}
}