import java.util.*;
class Account
{
 String name,cno;
 double bal;
 void input()
 {
  System.out.println("Enter details");
  Scanner sc=new Scanner(System.in);
  name=sc.next();
  cno=sc.next();
  bal=sc.nextDouble();
 }
 void output()
 {
  System.out.println("Details are " + name + " " + cno + " " +  bal );
 }
}
class Savings extends Account
{
 double r,t;
 void input()
 {
  super.input();
  System.out.println("Enter rate and time");
  Scanner sc=new Scanner(System.in);
  r=sc.nextDouble();
  t=sc.nextDouble();
 }
 double compute()
 {
  return (0.01*bal*r*t);
 }
 void output()
 {
  super.output();
  System.out.println("Interest is " + compute()); 
 }
}
class Inheritance
{
 public static void main(String args[])
 {
  Savings s=new Savings();
  s.input();
  s.output();
 }
}       
