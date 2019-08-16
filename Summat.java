import java.util.*;
class Summat
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no of rows and columns for martrix A and B ");
  int m=sc.nextInt();
  int n=sc.nextInt();
  int a[][]=new int[m][n];
  int b[][]=new int[m][n];
  int c[][]=new int[m][n];
  int i,j;
  System.out.println("Enter elements of martrix A ");
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
	a[i][j]=sc.nextInt();
  System.out.println("Enter elements of martrix B ");
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
	b[i][j]=sc.nextInt();
  System.out.println("Sum of matrix A and B is: "); 
  for(i=0;i<m;i++)
    {for(j=0;j<n;j++)
	{c[i][j]=a[i][j]+b[i][j];
	 System.out.print(c[i][j] + " ");
	}
     System.out.println("");
    }
	
 }
}
      
  