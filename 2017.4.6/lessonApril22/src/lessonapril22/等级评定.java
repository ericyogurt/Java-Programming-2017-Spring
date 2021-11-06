/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonapril22;

import java.util.Scanner;

/**
 *
 * @author founder
 */
public class 等级评定 {
    public static void main(String[] args){
        System.out.println("please input your score:");
        Scanner sc=new Scanner(System.in);
        double score=sc.nextDouble();
        int num=(int) (score/10);
        if (score<0||score>100){
            System.out.println("输入成绩不合法");
        }
        else{
        switch (num){
            case 10:
            case 9:
            System.out.println("优秀");
            break;   
            case 8:
            System.out.println("良好");
            break;
            case 7:
            System.out.println("中等");
            break; 
            case 6:
            System.out.println("合格");
            break;
            case 5:
            case 4:
            case 3:
            case 2:  
            case 1: 
            case 0:
           System.out.println("不合格");
                break;
            default:
                System.out.println("输入的成绩不合法");}
        }
    }
}
    

