/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class paixu {
    public static void main(String[] args){
        int yourArray[]={10,45,28,27,66,5,40,33,92,17};
        for (int i=0;i<yourArray.length ;i++ )
     {System.out.print(yourArray[i]+" ");
}
        System.out.println();
        Arrays.sort(yourArray);
     for (int i=0;i<yourArray.length ;i++ )
     {System.out.print(yourArray[i]+" ");
}
     System.out.println();
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int yourArray2[]={a,10,45,28,27,66,5,40,33,92,17};
     Arrays.sort(yourArray2);
     for (int i=0;i<yourArray2.length;i++){
         System.out.print(yourArray2[i]+" ");
     }
     System.out.println();
    }
}
     
   
