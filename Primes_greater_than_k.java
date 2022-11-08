import java.util.Scanner;
class java
{
    public static boolean isprime(int a)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==0)
        return true;
        else
        return false;
    }
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
        int p,A=0;
        p=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(isprime(x[i]))
            {
                if(x[i]>=p)
                {
                    A++;
                }
            }
        }
        System.out.println(A);
        
        
    }
}