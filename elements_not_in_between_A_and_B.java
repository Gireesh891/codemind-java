import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,a,b,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
        x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a>x[i] || b<x[i])
            {
                System.out.print(x[i]+" ");
                count++;
            }
        }
        if(count==0)
        System.out.println("-1");
    }
}