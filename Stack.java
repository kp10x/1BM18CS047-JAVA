import java.util.*;
interface Stk
{
 void push();
 void pop();
 void display();
}
class Dynamic implements Stk
{
 int n=0,item,top;
 Dynamic()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  n=sc.nextInt();
  top=-1;
 }
 int s[]=new int[n];
 public void push()
 {
  Scanner sc=new Scanner(System.in);
  if(top==n-1)
  {
   n*=2;
   int temp=new int[n];
   for(int i=0;i<=top;i++)
   	temp[i]=s[i];
   s=temp;
  }
  System.out.println("Enter the element to be pushed");
  s[++top]=item;	
 }
 int isEmpty()
 {
  if(top==-1)
   {
    System.out.println("Stack is empty");
    return 1;
   }
   return 0;
 }   
 public void pop()
 {
  if(isEmpty());
    return;
  System.out.println("Popped element is " + s[top--]);
 } 
 public void display()
 {
  for(int i=top;i>=0;i++)
    System.out.println(s[i]);
 }
}
class Stack
{
 publlic static void main(String args[])
 {
  Stk ref=new Dynamic();
  
    
   
    
    
     
   
 
