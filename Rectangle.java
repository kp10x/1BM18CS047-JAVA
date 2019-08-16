import java.util.*;
class Rect
{
 int len,wid;
 Scanner sc=new Scanner(System.in);
 void input()
 {
  System.out.println("Enter the length and width of rectangle:");
  len=sc.nextInt();
  wid=sc.nextInt();
 }
 void ar()
 {
  double area=len*wid;
  System.out.println("Area of rectangle:" + area);  
 }
}
class Rectangle
{
 public static void main(String args[])
 {
  Rect rect1=new Rect();
  Rect rect2=new Rect();
  rect1.input();
  rect2.input();
  rect1.ar();
  rect2.ar();
  }
}
 