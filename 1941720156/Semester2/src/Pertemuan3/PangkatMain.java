/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author DEBORA
 */
import java.util.Scanner;
public class PangkatMain {
    public static void main(String[] args){
        Scanner deb = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = deb.nextInt();
        System.out.println();
        
        Pangkat[] p = new Pangkat[elemen];
        for (int i=0; i<elemen; i++){
            p[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+": ");
            p[i].nilai = deb.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+": ");
            p[i].pangkat = deb.nextInt();
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Method\n1. Brute Force\n2. Divide Conquer");
        System.out.print("Silahkan pilih method (1/2): ");
        int pilih = deb.nextInt();
        
        if (pilih==1){
            System.out.println();
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i=0; i<elemen; i++){
            System.out.println("Nilai "+p[i].nilai+" adalah: "+
                    p[i].pangkatBF(p[i].nilai, p[i].pangkat));
            }   
        } else {
            System.out.println();
            System.out.println("Hasil pangkat dengan Divide and Conquer");
            for (int i=0; i<elemen; i++){
            System.out.println("Nilai "+p[i].nilai+" adalah: "+
                    p[i].pangkatDC(p[i].nilai, p[i].pangkat));
            }  
        }       
    }
}
