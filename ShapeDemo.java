import java.util.*;
abstract class Shape
{
 int x,y;
 abstract void printArea();
  
}
class Rectangle extends Shape
{
 void printArea()
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter length and breadth");
  x=sc.nextInt();
  y=sc.nextInt();
  System.out.println("Area is " + x*y);
 }
} 
class Triangle extends Shape
{
 void printArea()
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter base and height");
  x=sc.nextInt();
  y=sc.nextInt();
  System.out.println("Area is " + 0.5*x*y);
 }
}
class Circle extends Shape
{
 void printArea()
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter radius");
  x=sc.nextInt();
  y=0;
  System.out.println("Area is " + 3.14*x*x);
 }
} 
class ShapeDemo
{
 public static void main(String args[])
 {
  Shape ref=null;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 1 for rectangle");
  System.out.println("Enter 2 for triangle");
  System.out.println("Enter 3 for circle");
  int ch=sc.nextInt();
  if(ch==1)
    ref=new Rectangle();
  else if(ch==2)
    ref=new Triangle();
  else if(ch==3)
    ref=new Circle();
  ref.printArea();
 }
}       
      
