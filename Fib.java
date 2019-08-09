import java.util.*;
class Fib
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter limit of fibonacci(n)");
  int n=sc.nextInt();
  int first=0,second=1,temp,i;
  System.out.print(first+" ");
  for(i=1;i<n;i++)
  {
   System.out.print(second+" ");
   temp=second;
   second=first+second;
   first=temp;
  }
 }
}