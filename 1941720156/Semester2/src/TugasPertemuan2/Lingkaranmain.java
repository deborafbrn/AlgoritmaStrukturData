/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan2;

/**
 *
 * @author DEBORA
 */
import java.util.Scanner;
public class Lingkaranmain {
    public static void main(String[] args){
        Scanner deb = new Scanner(System.in);
        Lingkaran l = new Lingkaran(); 
        
        System.out.print("Masukkan jari-jari: ");
        l.r = deb.nextInt();
        l.hitungLuas();
        l.hitungKeliling();
        
    }
    
}
