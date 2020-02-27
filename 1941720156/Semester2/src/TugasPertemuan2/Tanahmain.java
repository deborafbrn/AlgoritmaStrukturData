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
public class Tanahmain {
    public static void main(String[] args){
        Scanner deb = new Scanner(System.in);
    System.out.println("Masukkan jumlah tanah: ");
        int jml = deb.nextInt();
        Tanah tn[] = new Tanah[jml];
        
        for(int a=0; a<tn.length; a++){
            System.out.print("Tanah ke-"+(a+1));
            tn[a] = new Tanah();
            System.out.print("Panjang: ");
            tn[a].panjang = deb.nextInt();
            System.out.print("Lebar: ");
            tn[a].lebar = deb.nextInt();
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            System.out.println("Tanah ke-"+(a+1));
            System.out.println("Panjang: "+tn[a].panjang);
            System.out.println("Lebar: "+tn[a].lebar);
            System.out.println();
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            System.out.println("Luas Tanah "+(a+1)+" : "+tn[a].hitungLuasTanah());
        }
    }   
}
