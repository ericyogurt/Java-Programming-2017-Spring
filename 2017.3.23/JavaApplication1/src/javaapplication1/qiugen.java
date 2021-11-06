/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class qiugen {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入方程系数：");
        System.out.println("a=");
        float a=cin.nextFloat();
        System.out.println("b=");
        float b=cin.nextFloat();
        System.out.println("c=");
        float c=cin.nextFloat();
        float temp=b*b-4*a*c;
        System.out.println(temp<0?"无解":"有解："+"x1="+(-b+sqrt(temp))/(2*a)+"\t"+"x2="+(-b-sqrt(temp))/(2*a));
         
    }
}
