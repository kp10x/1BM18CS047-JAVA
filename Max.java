import java.util.*;
class Max
{
 public static void main(String args[])
 {
  int n[]=new int[args.length];
  for(int i=0;i<args.length;i++)
  {
   n[i]=Integer.parseInt(args[i]);
  }
  int m=n[0];
  for(int i=1;i<args.length;i++)
  {
   if(n[i]>m)
    m=n[i];
  } 
  System.out.println("Max is " + m);  
 }
}  
