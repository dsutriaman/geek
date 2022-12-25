/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WhiteAlgorithm implements PenyihirAlgorithma {

    public List<Integer> init(Integer tahun) {
        int nprev = 0, ncurrent = 1, totsebelum = 1, nnext=0; 
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(totsebelum));
        for (int i = 0; i < tahun; ++i) {
            nnext = nprev + ncurrent;
            totsebelum = totsebelum + nnext;
            result.add(totsebelum);
            nprev = ncurrent;
            ncurrent = nnext;
        }
        return result;
    }
}

