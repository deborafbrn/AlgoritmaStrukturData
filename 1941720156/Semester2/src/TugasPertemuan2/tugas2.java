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
public class tugas2 {
    String namaMember, namaGame;
    int id, lamaSewa, hargaSewa, total;
    
    void dataPeminjaman(){
        
        System.out.println("Id barang: "+id);
        System.out.println("Nama game: "+namaGame);
        System.out.println("Nama member: "+namaMember);
        System.out.println("Lama sewa: "+lamaSewa+" hari");
        System.out.println("Harga sewa per hari: Rp. "+hargaSewa);
    }
    void hargaBayar(){
        total = lamaSewa*hargaSewa;
        System.out.println("Total harga sewa: Rp. "+ total);
    }
}
