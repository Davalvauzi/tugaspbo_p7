/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input;

import java.util.*;

/**
 *
 * @author MyPC PRO
 */
public class SalamKenal {
    public static void main( String[] args ) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan nama anda: ");
            String nama = masukan.nextLine();
            System.out.println("Halo, salam kenal sdr " + nama + " !");
    }
}
