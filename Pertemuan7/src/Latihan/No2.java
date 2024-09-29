package Latihan;

import java.util.*;

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        
        System.out.print("Total pembelian Rp. = ");
        double TBeli = input.nextDouble();
        
        double potongan;
        double jumlahBayar;
        
        if (TBeli < 50000) {
            potongan = TBeli * 0.05; 
        } else {
            potongan = TBeli * 0.20; 
        }
        jumlahBayar = TBeli - potongan;
        
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahBayar);
        
	}

}
