import java.util.Scanner;
class java
{
    public static boolean isprime(int a)
    {
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(isprime(x[i]))
            {
                if(x[i]<=k)
                {
                    c++;
                }
               
            }
        }
        System.out.println(c);
        
        
    }
}