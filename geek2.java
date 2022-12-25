/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bebas;

import java.util.List;


public class geek2 {
  public static void main(String[] args) {
        PenyihirAlgorithma algorithm = new WhiteAlgorithm();
        PopulatedData populatedData = new PopulatedData(algorithm);
        List<Integer> mapData = populatedData.algorithm.init(100);
        Integer personA = populatedData.cariJumlahOrang(mapData, 2);
        Integer personB = populatedData.cariJumlahOrang(mapData, 4);
        System.out.println(populatedData.Avg(personA, personB));
    }   
}
