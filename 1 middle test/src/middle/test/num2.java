/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.test;

import java.util.Arrays;
import java.util.Scanner;


public class num2 {
    public static void main(String[] args){
        int[] arr={10,7,9,2,4,5,1,3,6,8};
        Arrays.sort(arr);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Input a data of int type:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<10;i++){
            if(a==arr[i]){
                int b=i;
                System.out.println("this "+a+" is at "+i);

            }
            
        }
        if(a!=arr[0]&&a!=arr[1]&&a!=arr[2]&&a!=arr[3]&&a!=arr[4]&&a!=arr[5]&&
                a!=arr[6]&&a!=arr[7]&&a!=arr[8]&&a!=arr[9]){
            System.out.println("this "+a+" is not in the array");

        }
        
    }
}
