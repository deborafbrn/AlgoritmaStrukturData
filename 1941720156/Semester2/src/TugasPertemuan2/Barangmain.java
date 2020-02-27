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
public class Barangmain {
    public static void main(String[] args){
        Scanner debora = new Scanner(System.in);
        Barang b = new Barang();
        
        System.out.print("Masukkan nama barang: ");
        b.nama = debora.nextLine();
        System.out.print("Masukkan harga satuan: ");
        b.hargaSatuan = debora.nextInt();
        System.out.print("Masukkan jumlah beli: ");
        b.jumlah = debora.nextInt();
        
        System.out.println();
        b.hitungHargaTotal();
        b.hitungDiskon();
        b.hitungHargaBayar();
    }
    
}
