import java.util.Scanner;
class java
{
    public static boolean isprime(int a)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n==1)
        n=2;
        for(int i=n;i<=m;i++)
        {
            if(isprime(i))
            {
            System.out.println(i);
        
            }
            
        }
        
    }
    
}