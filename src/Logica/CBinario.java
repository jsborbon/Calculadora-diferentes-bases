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
 public class CBinario {
    public int ConvertirB(String x){
       int conversion;
        x = x.replaceAll("[3]", "11");
        x = x.replaceAll("[4]", "100");
        x = x.replaceAll("[5]", "101");
        x = x.replaceAll("[6]", "110");
        x = x.replaceAll("[7]", "111");
        x = x.replaceAll("[8]", "1000");
        x = x.replaceAll("[9]", "1001");
        x = x.replaceAll("[A]", "1010");
        x = x.replaceAll("[B]", "1011");
        x = x.replaceAll("[C]", "1100");
        x = x.replaceAll("[D]", "1101");
        x = x.replaceAll("[E]", "1110");
        x = x.replaceAll("[F]", "1111");
       conversion=parseInt(x, 2);
       return conversion;
    }
 }
    

