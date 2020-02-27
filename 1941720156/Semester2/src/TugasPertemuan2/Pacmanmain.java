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
public class Pacmanmain {
    public static void main(String[] args){
        Scanner deb = new Scanner(System.in);
        Pacman p = new Pacman();
        
        System.out.print("Masukkan nilai koordinat X: ");
        p.x = deb.nextInt();
        System.out.print("Masukkan nilai koordinat Y: ");
        p.y = deb.nextInt();
        System.out.print("Masukkan nilai Width: ");
        p.width = deb.nextInt();
        System.out.print("Masukkan nilai Height: ");
        p.height = deb.nextInt();
        
        System.out.println();
        p.moveLeft();
        p.moveRight();
        p.moveUp();
        p.moveDown();
        p.printPosition();
        
        
    }
    
}
