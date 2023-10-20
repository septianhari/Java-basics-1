package com.tutorial;

public class Main {

	public static void main(String[] args) {
		
		// void adalah ruang kosong
		
		System.out.println(simple());
	
		fungsiVoid("ngapain sih");
		
	}
	
	// fungsi atau method tanpa kembalian
	private static void fungsiVoid(String input) {
		System.out.println(input);
	}
	
	/*
	 fungsi atau method dengan kembalian sehingga menggunakan
	 return untuk mengembalikan nilainya (10.0f)
	 */
	private static float simple() {
		return 10.0f;
	}

}
