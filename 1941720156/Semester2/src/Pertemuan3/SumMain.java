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
public class SumMain {
    public static void main(String[] args){
    Scanner deb = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah perusahaan: ");
        int perusahaan = deb.nextInt();
        Sum s = new Sum (perusahaan);
        for (int i=0; i<perusahaan; i++){
            System.out.print("Masukkan jumlah bulan yang akan dihitung pada perusahaan ke-"+(i+1)+": ");
            s.bulan[i] = deb.nextDouble();
        }
        System.out.println();
       
        for (int i=0; i<s.elemen; i++){
            System.out.print("Masukkan untung bulan ke-"+(i+1)+": ");
            s.keuntungan[i] = deb.nextDouble();
        }
        System.out.println();
        
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+s.elemen+" bulan adalah: "+
                String.format("%.3f", s.totalBF(s.keuntungan)));
        System.out.println();
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+s.elemen+" bulan adalah: "+
                String.format("%.3f",s.totalDC(s.keuntungan, 0, s.elemen-1)));   
    }
}
