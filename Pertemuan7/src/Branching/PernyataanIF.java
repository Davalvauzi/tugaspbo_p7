/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branching;

/**
 *
 * @author MyPC PRO
 */
public class PernyataanIF {
    public static void main(String[] args) {
        int diskon = 0, totalBelanja = 5000000;
        if(totalBelanja>=1000000) {
            diskon = totalBelanja/10;
        }
        System.out.println("Diskon =" + diskon);
    }
}
