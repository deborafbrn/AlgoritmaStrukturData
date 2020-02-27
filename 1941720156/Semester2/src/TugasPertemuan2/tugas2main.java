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
public class tugas2main {
    public static void main(String[] args){
        Scanner debora = new Scanner(System.in);
        Scanner deb = new Scanner(System.in);
        tugas2 t = new tugas2();
        
        System.out.print("ID barang: ");
        t.id = debora.nextInt();
        System.out.print("Nama game: ");
        t.namaGame = deb.nextLine();
        System.out.print("Nama member: ");
        t.namaMember = deb.nextLine();
        System.out.print("Lama sewa: ");
        t.lamaSewa = debora.nextInt();
        System.out.print("Harga sewa: ");
        t.hargaSewa = debora.nextInt();
        
        System.out.println();
        t.dataPeminjaman();
        t.hargaBayar();
    }
    
}
