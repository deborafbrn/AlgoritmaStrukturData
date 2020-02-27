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

public class Lingkaran {
    double PHI = 3.14, r;
           
        void hitungLuas(){
            double luas = PHI*r*r;
            System.out.println("Luas lingkaran: "+luas);
        }
        
        void hitungKeliling(){
            double keliling = 2*3.14*r; 
            System.out.println("Keliling lingkaran: "+keliling);
        }
}

