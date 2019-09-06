import java.util.*;
class QueueDemo
{
 static int n=5;
 int q[]=new int[n];
 int f,r;
 QueueDemo()
 {
  f=0;
  r=-1;
 }
 void insert(int x)
 {
  if(r==n-1)
  {
   System.out.println("Queue overflow"); 
   return;
  }
  q[++r]=x;
 }
 int delete()
 {
  if(f>r)
  {
   System.out.println("Queue underflow");
   return -999;
  }
  return q[f++];
 }
 void display()
 {
  if(f>r)
  {
   System.out.println("Queue is empty");
   return;
  }
  System.out.println("Queue is:"); 
  for(int i=f;i<=r;i++)
   System.out.println(q[i]);
 }
}
class Queue
{
 public static void main(String args[])
 {
  QueueDemo ob=new QueueDemo();
  Scanner sc=new Scanner(System.in);
  int op,sel;
  do
  {
   System.out.println("Choose an operation:\n1.Insert\n2.Delete\n3.Display");
   op=sc.nextInt();
   switch(op)
   {
    case 1: int ele;
            System.out.println("Enter element to insert");
            ele=sc.nextInt();
            ob.insert(ele);
            break;
    case 2: int e;
            e=ob.delete();
    	    if(e==-999)
    	     break;
    	    System.out.println("Deleted element is" + e);    	      
    	    break;
    case 3: ob.display();
    	    break;
    default: System.out.println("Invalid option");
   }
   System.out.println("Enter 1 to continue");
   sel=sc.nextInt();
  }while(sel==1);
 } 
}   	    
    	             
      
       
