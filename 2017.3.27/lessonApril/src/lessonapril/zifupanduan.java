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
public class zifupanduan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        if (a.charAt(0)>='A'&&a.charAt(0)<='Z'){
       System.out.println("input a capital letter:"+a); }
        else if (a.charAt(0)>='a'&&a.charAt(0)<='z'){
        System.out.println("input a lower-case letter:"+a);}
        else if (a.charAt(0)>='0'&&a.charAt(0)<='9'){
        System.out.println("input a number:"+a);}
        else {
        System.out.println("input a symbol:"+a);}
    }
}
