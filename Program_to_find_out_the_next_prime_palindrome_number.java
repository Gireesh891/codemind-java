import java.util.Scanner;
class java
{
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static  boolean ispalindrome(int m)
    {
        int  r,sum=0;
        int temp=m;
        while(m>0)
        {
            r=m%10;
            sum=sum*10+r;
            m=m/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=a+1;;i++)
        {
            if(isprime(i) && ispalindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}