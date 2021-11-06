/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.test;

import java.util.Arrays;


public class num4 {
    public static void main(String[] args){
        String[] a={"car","bus","train","airplane","ship","truck"};
        for(int i=0;i<6;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
        String[] b=new String[7] ;
        for(int i=0;i<6;i++){
            b[i]=a[i];
        }
        b[6]="city";
        Arrays.sort(b);
        for(int i=0;i<7;i++){
            System.out.print(b[i]+",");
        }
        System.out.println();
    }
}
