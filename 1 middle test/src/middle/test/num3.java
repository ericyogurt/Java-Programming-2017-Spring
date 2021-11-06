/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.test;

import java.util.Scanner;


public class num3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Other CityName:");
        String cityname=sc.next();
        System.out.println("Input BeijingTime:");
        double bjtime=sc.nextDouble();
        if("Seoul".equals(cityname)){
            bjtime=bjtime+1;
            if(bjtime>24){
                bjtime=bjtime-24;
                System.out.println(cityname+" time is "+bjtime+" tomorrow.");
            }
            else if(bjtime>0&&bjtime<24){
               System.out.println(cityname+" time is "+bjtime+" today.");
            } 
            else{
                bjtime=bjtime+24;
                System.out.println(cityname+" time is "+bjtime+" yesterday.");
            }
            
        }
        if("Tokyo".equals(cityname)){
            bjtime=bjtime+1.5;
            if(bjtime>24){
                bjtime=bjtime-24;
                System.out.println(cityname+" time is "+bjtime+" tomorrow.");
            }
            
            else if(bjtime>0&&bjtime<24){
                System.out.println(cityname+" time is "+bjtime+" today.");
            }
            else{
                bjtime=bjtime+24;
                System.out.println(cityname+" time is "+bjtime+" yesterday.");
            }
            
        }
        if("Paris".equals(cityname)){
            bjtime=bjtime-7;
            if(bjtime>24){
                bjtime=bjtime-24;
                System.out.println(cityname+" time is "+bjtime+" tomorrow.");
            }
            else if(bjtime>0&&bjtime<24){
                System.out.println(cityname+" time is "+bjtime+" today.");
            }
            else{
                bjtime=bjtime+24;
                System.out.println(cityname+" time is "+bjtime+" yesterday.");
            }
            
        }
        if("Newyork".equals(cityname)){
            bjtime=bjtime-12;
            if(bjtime>24){
                bjtime=bjtime-24;
                System.out.println(cityname+" time is "+bjtime+" tomorrow.");
            }
            else if(bjtime>0&&bjtime<24){
                System.out.println(cityname+" time is "+bjtime+" today.");
            }
            else{
                bjtime=bjtime+24;
                System.out.println(cityname+" time is "+bjtime+" yesterday.");
            }
            
        }
        
    }
}
