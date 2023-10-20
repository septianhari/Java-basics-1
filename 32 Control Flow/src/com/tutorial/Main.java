package com.tutorial;

public class Main {

	public static void main(String[] args) {
		// Break, Continue, Return
		
		
		int a = 0;
		while(true) {
			a++;
			
			if(a == 10) {
				break; 
				// ini adalah keyword untuk memaksa keluar dari loop
			} else if(a == 2) {
				continue; 
				// ini adalah keyword untuk memaksa memulai aksi dari awal
			} else if (a == 8) {
				return;
			}
			
			
			
			System.out.println("looping ke - " + a);
			
		}
		
		System.out.println("akhir dari looping");

	}

}
