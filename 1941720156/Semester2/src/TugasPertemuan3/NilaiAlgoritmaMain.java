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
public class NilaiAlgoritmaMain {
    public static void main (String[] args) {
        Scanner deb = new Scanner(System.in);
        Scanner debora = new Scanner(System.in); 
        int mhs, total=0;
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        mhs = deb.nextInt();
        
        NilaiAlgoritma[] n = new NilaiAlgoritma[mhs]; 
        for (int i=0; i<mhs; i++){
            n[i] = new NilaiAlgoritma();
            System.out.println();
            System.out.print("Masukkan nama Mahasiswa ke- "+(i+1)+": ");
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
            total += n[i].hitungTotalNilai(mhs);
            System.out.println("Nilai total Mahasiswa "+n[i].namaMHS+" adalah "+n[i].hitungTotalNilai(mhs));
        }
        System.out.println("Rata-rata nilai total: "+(double)(total/mhs));
        
    }
}
