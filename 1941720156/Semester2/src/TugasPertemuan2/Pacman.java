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
public class Pacman {
    int x, y, width, height;
    int left, right, up, down, position;
    
    void moveLeft(){
        left = x-1;
        if (x<0 && x>width){
            System.out.println("Nilai koordinat X Anda kurang dari 0 atau melebihi nilai Width");
        } else {
            System.out.println("Nilai koordinat X move Left: "+left);
        }
    }
    void moveRight(){
        right = x+1;
        if (x<0 && x>width){
            System.out.println("Nilai koordinat X Anda kurang dari 0 atau melebihi nilai Width");
        } else {
            System.out.println("Nilai koordinat Y move Right: "+right);
        }
    } 
    void moveUp(){
        up = y-1;
        if (y<0 && y>height){
            System.out.println("Koordinat Y Anda kurang dari 0 atau melibihi nilai Height");
        } else {
            System.out.println("Nilai koordinat Y move Up: "+up);
        }
    }
    void moveDown(){
        down = y+1;
        if (y<0 && y>height) {
          System.out.println("Koordinat Y Anda kurang dari 0 atau melibihi nilai Height");  
        } else {
            System.out.println("Nilai koordinat Y move Down: "+down);
        }
    }
    
    void printPosition(){
    
    }
 
        
}
