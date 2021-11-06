/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril22;

/**
 *
 * @author Eric
 */
import java.util.Scanner;   
public class 二元数组{   
   public static void main(String[] args) {   
      Scanner sc=new Scanner(System.in);      
       double[][] score=new double[5][3];      
       double m[]={0,0,0};           
       for(int i=0;i<5;i++)
       {      
          for(int j=0;j<3;j++)
          {      
          
              double a=sc.nextDouble();       
          
              score[i][j]=a;   
         
              m[j]=m[j]+score[i][j];   
         }      
      }   
       for(int j=0;j<3;j++){      
            System.out.print(m[j]/5+" ");      
        }
       System.out.println();
    }   
}
