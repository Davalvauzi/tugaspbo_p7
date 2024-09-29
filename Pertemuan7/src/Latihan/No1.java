package Latihan;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("NPM: ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran: ");
        double NHadir= input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        double NT = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        double NUTS = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        double NUAS = input.nextDouble();
        
        int NAkhir = (int) ((0.10 * NHadir) + (0.20 * NT) + (0.30 * NUTS) + (0.40 * NUAS));
        
        String grade, keterangan;
        switch (NAkhir/10) {
        case 10: 
        case 9:  
        case 8:  
        case 7:  
            grade = "A";
            keterangan = "istimewa";
            break;
        case 6: 
            grade = "B";
            keterangan = "baig";
            break;
        case 5: 
            grade = "C";
            keterangan = "cukup";
            break;
        case 4: 
            grade = "D";
            keterangan = "kurang";
            break;
        default:
            grade = "E";
            keterangan = "kurang sekali";
            break;
    }
        
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + NAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
        
	}

}
