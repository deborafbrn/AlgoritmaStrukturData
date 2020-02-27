/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan3;

import java.util.Scanner;

/**
 *
 * @author DEBORA
 */
import java.util.Scanner;
public class DiagramMain {
    public static void main(String[] args) {
        Scanner deb = new Scanner(System.in);
        Diagram dg = new Diagram();
        
        Diagram[] dig = new Diagram[dg.jumlahKandidat];
        for (int i = 0; i < dg.jumlahKandidat; i++){
            dig[i] = new Diagram();
            System.out.print("\nNama Kandidat ke - " + (i + 1) + " : ");
            dig[i].kandidat = deb.nextLine();
        }
        System.out.println();
        for (int i = 0; i < dg.jumlahKandidat; i++){
            System.out.print("Jumlah Suara Kandidat ke - " + (i + 1) + " : ");
            dig[i].suara = deb.nextInt();
            dg.jumlahSuara += dig[i].suara;
        }
        int hasil = dg.hitung(dg.jumlahSuara , dig[0].suara , dig[1].suara , dig[2].suara, dig[3].suara);
        if (hasil == 0){
            System.out.println("Masing - masing kandidat memiliki mayoritas yang hampir sama");
        }
        else {
            System.out.println("Ketua BEM yang terpilih aadala " + dig[hasil - 1].kandidat);
        }
    }
}
