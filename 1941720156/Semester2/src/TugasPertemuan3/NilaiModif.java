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
public class NilaiModif {
    public String namaMHS;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    public double hitungTotalNilaiDC(int n){
        if (n<1) {
            return 0;
        }else {
            double x = (nilaiTugas+nilaiUAS)*0.3;
            double y = (nilaiKuis+nilaiUTS)*0.2;
            return x+y;
        }
    }
    
}
