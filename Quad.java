import java.util.*;
class Quad
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter values for a,b,c");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  float d=(float)((b*b)-(4*a*c));
  float x1,x2;
  
  if(d>0)
  {
   System.out.println("Roots are real and distinct");
   x1=(float)(-b+Math.sqrt(d))/(2*a);
   x2=(float)(-b-Math.sqrt(d))/(2*a);
   System.out.println("Roots are " + x1 + " and " + x2);
  }
  else if(d==0)
  {
   System.out.println("Roots are real and equal");
   x1=(float)(-b/(2*a));
   x2=x1;
   System.out.println("Roots are " + x1 + " and " + x2);
  }
  else
    System.out.println("Imaginary");
 }
}