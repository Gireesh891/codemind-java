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
    public static int reverse(int b)
    {
        int r=0,sum=0;
        while(b>0)
        {
            r=b%10;
            sum=sum*10+r;
            b=b/10;
            
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(!isprime(n))
        System.out.println("not prime");
        else if(isprime(reverse(n)))
        System.out.println("circular prime");
        else
        System.out.println("prime but not a circular prime");
    }    
    
}