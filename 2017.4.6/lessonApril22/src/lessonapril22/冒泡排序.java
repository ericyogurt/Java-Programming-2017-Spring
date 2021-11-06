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
public class 冒泡排序 {
    public static void main(String[] args){
        int[] time= {341,278,273,329,445,402,388,275,243,334,412,393,299,343,317,265};
        String[] name={"Elena","Hamilton","Thomas","Suzie","Phil","Matt","Alex",
            "Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
        for(int i=1;i<time.length;i++){
            for(int j=0;j<time.length-i;j++){
                if(time[j]>time[j+1]){
                    int temp=time[j+1];
                    time[j+1]=time[j];
                    time[j]=temp;
                    String s=name[j+1];
                    name[j+1]=name[j];
                    name[j]=s;        
                }
            }
                
        }
        System.out.println("The fastest runner is:"+name[0]+"  "+"times:"+time[0]);
        System.out.println("The second fastest runner is:"+name[1]+"  "+"times:"+time[1]);
    }
}
