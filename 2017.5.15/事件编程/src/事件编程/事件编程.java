/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 事件编程;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



 public class 事件编程 {
public static void main(String[] args)
{
final JFrame f = new JFrame();
f.setTitle("二进制转化十进制");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(480,100);
f.setLayout(null);
Container con=f.getContentPane();
final JLabel t1 = new JLabel("....结果是....");
t1.setBounds(20,0,100,40);
final JTextField l1 = new JTextField(40);
l1.setBounds(90,10,100,20);
JButton b1 = new JButton("转换");
b1.setBounds(200,10,100,20);
f.add(b1);
f.add(t1);
f.add(l1);
f.setVisible(true);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String s=l1.getText();
if(!s.matches("^[01]+$")){
JOptionPane.showMessageDialog(f, "请输入一个二进制数", "输入错误", JOptionPane.ERROR_MESSAGE);
}else{
int result=Integer.parseInt(s,2);
t1.setText("result="+result);
 };

}
});
        }
 }




