package snippet;

public class Snippet {
	 Scanner userInput = new Scanner(System.in);
	        int panjang, lebar, luas, tinggi, volume;
	        // Membuat perhitungan menghitung luas persegi panjang
	        // luas = panjang * lebar
	
	        System.out.println("MENGHITUNG LUAS");
	        System.out.print("panjang = ");
	        panjang = userInput.nextInt();
	        System.out.print("lebar = ");
	        lebar = userInput.nextInt();
	
	        luas = panjang * lebar;
	        System.out.println("Luas = " + luas);
	
	        System.out.println("MENGHITUNG VOLUME");
	        System.out.print("tinggi = ");
	        tinggi = userInput.nextInt();
	        volume = luas*tinggi;
	        System.out.println("volume = "+ volume);
}
