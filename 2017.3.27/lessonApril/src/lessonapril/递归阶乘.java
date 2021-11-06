/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril;



/**
 *
 * @author Eric
 */
public class 递归阶乘 {
    public static void main(String args[]) {
        double e = 1.0;
        int t = 1;
        while (1 / factorial(t) > 0.00001) {
            e = e + 1.0 / factorial(t);
            t++;
        }
        System.out.println("The approximation value of e:" + e);
    }

    public static double factorial(int n) {
        if (n == 0)
            return 1.0;
        else
            return n * factorial(n - 1);
    }
}

