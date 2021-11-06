/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.test;

/**
 *
 * @author founder
 */
public class MiddleTest {

    public static void main(String[] args) {
       int a=0;
       int sum=0;
        for(int i=1;i<1001;i++){
           if(i%3==2&&i%5==3&&i%7==4){
               System.out.print(i+",");
               sum=sum+1;
           }
           
       }
        System.out.println();
           System.out.println("the total number:"+sum);
    }
}
