import java.util.*;
class Person
{
 String name,address;
 int age;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter name, age and address:");
  name=sc.next();
  age=sc.nextInt();
  address=sc.next();
 }
 void display()
 {
  System.out.println("Name: "+name+"\nAge: "+age+"\nAddress: "+address);
 }
}
class Student extends Person
{
 int rno,sem;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  super.accept();
  System.out.println("Enter rollno and sem:"); 
  rno=sc.nextInt();
  sem=sc.nextInt();
 }
 void display()
 {
  super.display();
  System.out.println("Rollno: "+rno+"\nSem: "+sem); 
 }
}
class Exam extends Student
{
 float marks1,marks2,avg;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  super.accept();
  System.out.println("Enter marks1 and marks2:"); 
  marks1=sc.nextFloat();
  marks2=sc.nextFloat();
 }
 float calc()
 {
  avg=(marks1+marks2)/2;
  return avg;
 }
 void display()
 {
  super.display();
  System.out.println("Marks1: "+marks1+"\nMarks2: "+marks2+"\nAverage: "+calc());
 }
}
class PersonDemo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no of students: ");
  int n=sc.nextInt();
  Exam s[]=new Exam[n];
  float max=0;
  int id=0;
  for(int i=0;i<n;i++)
  {
   s[i]=new Exam();
   s[i].accept();
   if(max<s[i].calc())
   {
    max=s[i].avg;
    id=i;
   }
  }
  System.out.println("Topper is: ");
  s[id].display();
 }
}    
        
