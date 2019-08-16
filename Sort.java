import java.util.*;
class Sort
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size");
  int n=sc.nextInt();
  int a[]=new int[n];
  int i,j,temp;
  System.out.println("Enter elements of array");
  for(i=0;i<n;i++)
     a[i]=sc.nextInt();
  for(i=0;i<n;i++)
   for(j=0;j<n-1;j++)
     { if(a[j]>a[j+1])
        {
         temp=a[j];
	 a[j]=a[j+1];
	 a[j+1]=temp;
	}
     }
   System.out.println("Sorted Aarray is:");
  for(i=0;i<n;i++)
     System.out.print(a[i] + " ");
 }
}
      
  