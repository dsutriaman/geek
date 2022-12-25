/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bebas;

import java.util.List;


public class PopulatedData {
    PenyihirAlgorithma algorithm;

    PopulatedData(PenyihirAlgorithma algorithm) {
        this.algorithm = algorithm;
    }

    
   public Integer cariJumlahOrang(List<Integer> data, Integer tahun){
        if (tahun < 1 || tahun > data.size() || data.get(tahun -1) < 0) {
            return -1;
        }
        return data.get(tahun - 1); 
   }
   
   public String Avg(Integer A, Integer B){
       String s="";
       if ((A==-1) || (B==-1) ){
           s = "result = -1";
       }
       else {
           s = "Average = "+String.format("%.2f",(double)(A+B)/2);
       }
       return s;
   }
}
