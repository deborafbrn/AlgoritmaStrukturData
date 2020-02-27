/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan3;

/**
 *
 * @author DEBORA
 */
public class NilaiAlgoritma {
    String namaMHS;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    public double hitungTotalNilai(int a) {
            double nilaitotal = 1;
            for (int i=0; i<a; i++){
            nilaitotal = (nilaiTugas*0.3)+(nilaiKuis*0.2)+
                    (nilaiUTS*0.2)+(nilaiUAS*0.3);   
            }
            return nilaitotal;
        }
}