import java.util.*;
class Empdat
{
    String empname;
    int empid;
    double da,it,basic,netsal;

    void read()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        empname=sc.next();
        System.out.println("Enter employee id:");
        empid=sc.nextInt();
        System.out.println("Enter basic salary:");

    }
    void calcsal()
    {
        da=basic*0.75;
        it=0.3*(da+basic);
        netsal=basic+da-it;
    }
    void display()
    {   System.out.println("Employee details:");
        System.out.println("Employee name is "+ empname);
        System.out.println("Employee id is "+ empid);
        System.out.println("Basic salary is "+ basic);
        System.out.println("DA is "+ da);
        System.out.println("IT is "+ it);
        System.out.println("Netsal is "+ netsal);
    }
}
class Emp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Empdat ob=new Empdat();
        System.out.println("Enter number of employees:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ob.read();
            ob.calcsal();
            ob.display();
        }
    }
}