/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Math.sin;
import java.util.Random;
/**
 *
 * @author founder
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran=new Random();
        int num=ran.nextInt(900)+100;
        System.out.println("num="+num);
        double res=sin(num);
        System.out.println("sin("+num+")="+res);
        int g=num%10;
        int s=num/10%10;
        int b=num/100;
        System.out.println("sum="+(g+s+b));
                
    }
}
