/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class 数组成绩 {
    public static void main(String[] args){
       double[] a=new double[3];
       double[] b=new double[3];
       double[] c=new double[3];
       double[] d=new double[3];
       double[] e=new double[3];
       Scanner sc=new Scanner(System.in);
       for (int i=0;i<a.length;i++)
       { 
           a[i]=sc.nextDouble();                  
       }  
       for (int i=0;i<a.length;i++)
       { 
           b[i]=sc.nextDouble();                  
       }  
       for (int i=0;i<a.length;i++)
       { 
           c[i]=sc.nextDouble();                  
       }  
       for (int i=0;i<a.length;i++)
       { 
           d[i]=sc.nextDouble();                  
       }  
       for (int i=0;i<a.length;i++)
       { 
           e[i]=sc.nextDouble();                  
       }  
       double ap=(a[0]+b[0]+c[0]+d[0]+e[0])/5;
       double bp=(a[1]+b[1]+c[1]+d[1]+e[1])/5;
       double cp=(a[2]+b[2]+c[2]+d[2]+e[2])/5;

       
       System.out.println(ap+" "+bp+" "+cp+" ");
    }
}
