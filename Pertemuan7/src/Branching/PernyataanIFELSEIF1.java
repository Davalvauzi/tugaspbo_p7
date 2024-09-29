/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Branching;

/**
 *
 * @author MyPC PRO
 */
public class PernyataanIFELSEIF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int skorUjian = 86; 
        char nilai;
        if(skorUjian >= 90){
            nilai = 'a';
        } else if (skorUjian >= 80){
            nilai = 'b';
        } else if (skorUjian >= 70) {
            nilai = 'c';
        } else {
            nilai = 'd';
        }
        System.out.println("nilai : " + nilai);
    }
    
}
