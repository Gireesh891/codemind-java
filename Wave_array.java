import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=1;i<(n-1);i++)
        {
            if(x[i-1]<x[i] && x[i+1]>x[i] || x[i-1]>x[i] && x[i+1]<x[i])
            {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
    }
}