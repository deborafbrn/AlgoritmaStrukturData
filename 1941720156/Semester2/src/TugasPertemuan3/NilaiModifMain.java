/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan3;

/**
 *
 * @author DEBORA
 */
import java.util.Scanner;
public class NilaiModifMain {
    public static void main(String[] args) {
        Scanner deb = new Scanner(System.in);
        Scanner debora = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int mhs = deb.nextInt();
        
        NilaiModif[] n = new NilaiModif[mhs];
        
        for (int i=0; i<mhs; i++) {
            n[i] = new NilaiModif();
            System.out.println();
            
            System.out.println("Masukkan nama Mahasiswa ke-"+(i+1+": "));
            n[i].namaMHS = debora.nextLine();
            System.out.print("Masukkan nilai tugas: ");
            n[i].nilaiTugas = deb.nextInt();
            System.out.print("Masukkan nilai kuis: ");
            n[i].nilaiKuis = deb.nextInt();
            System.out.print("Masukkan nilai UTS: ");
            n[i].nilaiUTS = deb.nextInt();
            System.out.print("Masukkan nilai UAS: ");
            n[i].nilaiUAS = deb.nextInt();
            System.out.println();
        }
        for (int i=0; i<mhs; i++) {
            System.out.println("Nilai total Mahasiswa "+n[i].namaMHS+" adalah "+
                    n[i].hitungTotalNilaiDC(mhs));
        }
    }
}
