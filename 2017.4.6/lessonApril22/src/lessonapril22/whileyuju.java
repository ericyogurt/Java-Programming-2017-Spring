/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril22;

/**
 *
 * @author founder
 */
public class whileyuju {
    public static void main(String[] args){
        int n=0;
        int sum=0;
        while (sum<500){
            n=n+1;
            sum=sum+n;
        }
       System.out.println("n="+(n-1)+" sum="+(sum-n));
    }
}
