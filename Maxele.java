import java.util.*;
class Maxele
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no of rows and columns for 2D array");
  int m=sc.nextInt();
  int n=sc.nextInt();
  int a[][]=new int[m][n];
  int i,j;
  System.out.println("Enter elements of 2D array");
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
	a[i][j]=sc.nextInt();
  int max=a[0][0];
  for(int a1[] : a)
  {for(int x : a1)
   {
    if(x>max)
      max=x;
   }
  }
 System.out.println("Max element is " + max); 	
 }
}
      
  