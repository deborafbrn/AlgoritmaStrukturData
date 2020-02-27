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
public class Kampusmain {
    public static void main(String[] args) {
        Scanner deb = new Scanner(System.in);
        
        System.out.print("Jumlah mahasiswa: ");
        int jml = deb.nextInt();
        Kampus kmps[] = new Kampus[jml];
        
        for(int a=0; a<kmps.length; a++){
            System.out.print("Mhs "+(a+1));
            kmps[a] = new Kampus();
            System.out.print("Nilai 1: ");
            kmps[a].nilai1 = deb.nextInt();
            System.out.print("Nilai 2: ");
            kmps[a].nilai2 = deb.nextInt();
        }
        System.out.println();
        for(int a=0; a<kmps.length; a++){
            System.out.println("Mhs "+(a+1));
            System.out.println("Nilai 1: "+kmps[a].nilai1);
            System.out.println("Nilai 2: "+kmps[a].nilai2);
            
        }
        System.out.println();
        for(int a=0; a<kmps.length; a++){
            System.out.println("Nilai Terbaik Mhs "+(a+1)+" : "+kmps[a].nilaiTerbaik());
            
        }
    }   
}
