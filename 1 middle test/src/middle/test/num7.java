/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.test;

import java.util.Scanner;
public class num7 {
    public static void main(String[] args){
        System.out.println("Please Input a Pay:");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        int t=0;
        double b=0.0;
        double temp=0;
        if(a>=0&&a<=100){
            t=1;
        }else if(a>100&&a<=300){
            t=2;
        }else if(a>300&&a<=500){
            t=3;
        }else if(a>500){
            t=4;
        }else{
            t=5;
        }
        switch(t){
            case 1:{
               
                System.out.println("the total money:"+a); 
                System.out.println("the discount:"+b); 
            }break;
                case 2:{
                    temp=a;
                    a=0.9*a;
                    b=temp-a;
                System.out.println("the total money:"+a); 
                System.out.println("the discount:0.9");
            }break;
                    case 3:{
                       temp=a;
                    a=0.85*a;
                    b=temp-a;
                System.out.println("the total money:"+a); 
                System.out.println("the discount:0.85");
            }break;
                        case 4:{temp=a;
                    a=0.8*a;
                    b=temp-a;
                System.out.println("the total money:"+a); 
                System.out.println("the discount:0.8");
            }break;
                            case 5:{
                System.out.println("please input correct cash");
            }break;
        }
    }
}
