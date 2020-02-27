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
public class FaktoMain {
    public static void main(String[] args){
    Scanner deb = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = deb.nextInt();
        System.out.println();
        
        Faktorial[] fk = new Faktorial[elemen];
        for (int i=0; i<elemen; i++){   
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai-nilai data ke-"+(i+1)+": ");
            fk[i].nilai = deb.nextInt();
        }
        System.out.println();
        
        long start,end;
        System.out.println("Hasil Faktorial dengan Brute Force");
        start = System.nanoTime();
        for (int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+
                    fk[i].nilai+" adalah: "+fk[i].faktorialBF(fk[i].nilai));
        }
        end = System.nanoTime();
        System.out.println("Waktu eksekusi: "+(end-start)/1000000+" millisecond");
        System.out.println();
        
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        start = System.nanoTime();
        for (int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+
                    fk[i].nilai+" adalah: "+fk[i].faktorialDC(fk[i].nilai));
        }
        end = System.nanoTime();
        System.out.println("Waktu eksekusi: "+(end-start)/1000000+" millisecond");
    }
}
