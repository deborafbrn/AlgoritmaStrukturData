/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author DEBORA
 */
import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;

public static void main(String[]args){
Scanner debora = new Scanner(System.in);    
PersegiPanjang[] ppArray = new PersegiPanjang[3];

ppArray[0] = new PersegiPanjang();
ppArray[0].panjang = 110;
ppArray[0].lebar = 30;

ppArray[1] = new PersegiPanjang();
ppArray[1].panjang = 80;
ppArray[1].lebar = 40;

ppArray[2] = new PersegiPanjang();
ppArray[2].panjang = 100;
ppArray[2].lebar = 20;

for (int i=0; i<3; i++) {
        ppArray[0] = new PersegiPanjang();
        System.out.println("Persegi panjang ke-"+i);
        System.out.print("Masukkan panjang: ");
        ppArray[0].panjang = debora.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[0].lebar = debora.nextInt();
    }
for (int i=0; i<3; i++){
    System.out.println("Persegi panjang ke-"+i);
    System.out.println("Panjang: "+ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
}
}
}
