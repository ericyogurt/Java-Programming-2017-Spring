/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class LessonApril {

    
    public static  void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       for(int i=2;i<a;i++){if (a%i==0){System.out.println("No.");break;}else
       {System.out.println("yes.");break;}}
    }
    
}
