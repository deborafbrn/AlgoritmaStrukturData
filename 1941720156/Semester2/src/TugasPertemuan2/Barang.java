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
public class Barang {
        String nama;
        int hargaSatuan, jumlah, total;
        double diskon, bayar;
        
        void hitungHargaTotal(){
            System.out.println("Nama barang: "+nama);
            System.out.println("Harga satuan: "+hargaSatuan);
            System.out.println("Jumlah beli: "+jumlah);
            total = hargaSatuan*jumlah;
        }
        void hitungDiskon(){
            System.out.println("Total bayar Anda: "+total);
         
            if (total> 100000){
                diskon = 0.1*hargaSatuan;
                System.out.println("Anda mendapat diskon 10%");
            } else if (total >= 50000 && jumlah < 100000){
                diskon = 0.05*hargaSatuan;
                System.out.println("Anda mendapat diskon sebesar 5%");
            } else {
                System.out.println("Anda tidak mendapat diskon");
            }
        }
        void hitungHargaBayar(){
            bayar = total-diskon;
            System.out.println("Jumlah bayar: Rp. "+bayar);
        }
    
}
