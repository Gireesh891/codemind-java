import java.util.Scanner;
class java
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a=n/2;
        for(int i=0;i<a;i++)
        {
            System.out.print(x[i]+" "+x[a++]+" ");
            
        }
    }
}