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
public class CDecimal {
       public int ConvertirD(String x){
       int conversion;
        x = x.replaceAll("[A]", "10");
        x = x.replaceAll("[B]", "11");
        x = x.replaceAll("[C]", "12");
        x = x.replaceAll("[D]", "13");
        x = x.replaceAll("[E]", "14");
        x = x.replaceAll("[F]", "15");
       conversion=parseInt(x, 10);
       return conversion;
}
}
