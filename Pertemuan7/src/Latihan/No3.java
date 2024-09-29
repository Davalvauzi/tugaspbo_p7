package Latihan;

import java.util.*;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan (kg): ");
        double BB = input.nextDouble();
        
        System.out.print("Masukkan Tinggi Badan (m): ");
        double TB = input.nextDouble();

        double imt = BB/ (TB * TB);

        String kriteria;

        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        System.out.printf("IMT: " + imt );
        System.out.println("\nKriteria: " + kriteria);
        
	}

}
