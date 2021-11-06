/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril22;

/**
 *
 * @author founder
 */
public class LessonApril22 {
  
    public static void main(String[] args) {
         int nu1=5,  nu2=5;
    System.out.println("nu1= = nu2 结果是"+(nu1==nu2));
    Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    Integer n3 = n1; 
    System.out.println("n1= = n2 结果是"+(n1==n2));
    System.out.println ("n1.equals(n2) 结果是"+ n1.equals(n3));
    System.out.println("n1= = n3 结果是"+(n1==n3));
    System.out.println ("n1.equals(n3) 结果是"+ n1.equals(n3));
    String s1="Morning!";
    String s2="morning!";
    boolean eq=s1.equals(s2);
    System.out.println("\"Morning\".equals(\"morning\")结果是"+eq);
    int res=s1.compareTo(s2);
    System.out.println("\"Morning\".compareTo(\"morning\")结果是"+res);} 
    }
    

