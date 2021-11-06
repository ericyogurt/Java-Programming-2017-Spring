/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril22;

import java.util.Scanner;

/**
 *
 * @author founder
 */
public class charactercompare {
    public static void main(String[] args){
        System.out.println("I am a student,I am from Brijing");
        Scanner sc=new Scanner(System.in);
        String x = sc.nextLine();
        char[] ju = x.toCharArray();
        char[] a={
           'I',' ','a','m',' ','a',' ',
           's','t','u','d','e','n','t',',','I',' ','a','m',' ',
                'f','r','o','m',' ','B','r','i','j','i','n','g'};
        for (int i=0;i<ju.length;i++){
            if (ju[i]!=a[i]){
                a[i]=ju[i];
                System.out.print("\""+a[i]+"\"");
                
            }else{
                System.out.print(a[i]);
                
            }
            
        }
        System.out.println();
        
    }
}
