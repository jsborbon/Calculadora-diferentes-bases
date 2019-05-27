/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static java.lang.Integer.parseInt;

/**
 *
 * @author carlo
 */
public class COctal {
       public int ConvertirO(String x){
       int conversion;
        x = x.replaceAll("[8]", "10");
        x = x.replaceAll("[9]", "11");
        x = x.replaceAll("[A]", "12");
        x = x.replaceAll("[B]", "13");
        x = x.replaceAll("[C]", "14");
        x = x.replaceAll("[D]", "15");
        x = x.replaceAll("[E]", "16");
        x = x.replaceAll("[F]", "17");
       conversion=parseInt(x, 8);
       return conversion;
}
}
