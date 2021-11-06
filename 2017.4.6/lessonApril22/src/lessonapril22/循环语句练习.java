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
public class 循环语句练习 {
    public static void main(String[] args){
        System.out.println("please input n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
