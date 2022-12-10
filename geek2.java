/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bebas;

import java.util.ArrayList;
import java.util.Arrays;
 
public class geek2 {
    
    public static ArrayList<Integer> deretAkhir(long number) {
        int nprev=0,ncurrent=1,nnext; 
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        
        for(int i=2; i<number; ++i){ //loop starts dari 2 karena 1 sudah diinisialisasi
           nnext=nprev+ncurrent;  
           result.add(nnext);
           nprev=ncurrent;  
           ncurrent=nnext;  
        }
        return result;
    }
    
     public static void main(String[] args) { 
         int startIndexArr = 3;
         int jumlahTahunKe=10;
         int personA=2;
         int personB=4;
         
         ArrayList<Integer> getDeretAkhir = new geek2().deretAkhir(jumlahTahunKe+startIndexArr); 
         ArrayList<Integer> tableMap = isiParirimbon(getDeretAkhir);
         if ((personA-1 > jumlahTahunKe) || (personB-1 > jumlahTahunKe)){
             System.out.println("result = -1");
         }
         else {
           System.out.printf("average = %.2f " , (double)(tableMap.get(personA-1) + tableMap.get(personB-1))/2);    
         }
     }

    private static ArrayList<Integer> isiParirimbon(ArrayList<Integer> deretAkhir) {
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1));
        int totsebelum = 1;
         for (int a=1;a<deretAkhir.size();a++){
                  totsebelum = totsebelum + deretAkhir.get(a-1);
                  result.add(totsebelum);
            }
        return result;
    }

     
}
