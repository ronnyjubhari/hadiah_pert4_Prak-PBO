import java.util.Scanner;

public class hadiahPrak4{
	public static void main(String[] args)
	{
		String nama, alamat;
		char tPesawat;
		long harga = 0;
		long bayar, kembalian;
		boolean loop = true;

		Scanner input = new Scanner(System.in);		
		
		System.out.println("Tipe Pesawat       Harga   ");
		System.out.println("    A  		  Rp. 5.000.000");
		System.out.println("    B 		  Rp. 2.000.000");
		System.out.println("    C  		  Rp. 1.000.000");
		
		System.out.println("");
		System.out.print("Masukkan Nama : ");
		nama= input.nextLine();
		System.out.print("Masukkan Alamat : ");
		alamat= input.nextLine();
	    	
    	
    	while(loop)
    	{
    		System.out.print("Masukkan Tipe Pesawat(A/B/C) : ");
			tPesawat= input.next().charAt(0);
    		switch(tPesawat)
	    	{
	    		case 'A' :
	    			harga = 5000000;
	    			loop = false;
	    			break;
	    		case 'B' :
	    			harga = 2000000;
	    			loop = false;
	    			break;
	    		case 'C' :
	    			harga = 1000000;
	    			loop = false;
	    			break;
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih 1-3");
	    			System.out.println("");
	    	}
    	}
    	
		System.out.println("Harga : Rp. " + harga);
		System.out.print("Bayar : Rp. ");
		bayar = input.nextLong();
		
		kembalian = bayar - harga;
		
		System.out.println("");
		System.out.println("");
		System.out.println("#--------------------------#");
		System.out.println("Nama : " + nama);
		System.out.println("Alamat : " + alamat);
		System.out.println("Kembalian Anda: Rp. " + kembalian);		
	}
}