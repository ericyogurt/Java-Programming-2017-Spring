/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口练习;

/**
 *
 * @author Eric
 */
public class 接口练习 {
    public static void main(String[] args) {
         Circle  c = new Circle(3);
       Rectangle r = new Rectangle(5,5);
       Box b = new Box(10,5,10);
       Sphere s = new Sphere(8);
       System.out.println("圆的面积："+c.getArea());
       System.out.println("长方形的面积："+r.getArea());
       System.out.println("长方体的体积："+b.getVolum());
       System.out.println("球的面积："+s.getVolum());

    }
    
}
interface Shape{
    double Pi=3.1415926;
    String getColor();
}
interface Shape2D extends Shape{
    double getArea();
    double getlength();
}
interface Shape3D extends Shape{
    
    double getVolum();
}
class Circle implements Shape2D{
    double radious;
    String color;
    public Circle(double x){
        radious=x;
    }
    public double getArea(){
        return Pi*radious*radious;
    }
    public double getlength(){
        return 2*Pi*radious;
        
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String incolor){
        this.color=incolor;
    }
    
}
class  Rectangle implements Shape2D
    {
        double width;
        double hight;
        String color;
        public Rectangle(double width,double hight)
        {
            this.width = width;
            this.hight = hight;
        }
        public double getArea()
        {
            return width * hight;
        }
        public double getlength(){
        return 2*width*hight;
        
    }
        public String getColor(){
        return this.color;
    }
    public void setColor(String incolor){
        this.color=incolor;
    }
    }
    class Box implements Shape3D
    {String color;
        double length ;
        double width ;
        double height ;
        public Box(double length,double width,double height)
        {
            this.length = length;
            this.width = width;
            this.height = height;
        }
        public  double getVolum()
        {
            return length * width * height;
        }
        public String getColor(){
        return this.color;
    }
    public void setColor(String incolor){
        this.color=incolor;
    }
    }
  class  Sphere  implements  Shape3D
    {String color;
        double r;
        public Sphere(double r)
        {
            this.r = r;
        }
        public  double getVolum()
        {
            return Pi*r*r*r*3/4;
        }
        public String getColor(){
        return this.color;
    }
    public void setColor(String incolor){
        this.color=incolor;
    }
    }
