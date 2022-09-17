import java.util.Scanner;
class java
{
    public static boolean isprime(int n)
    {
        int count=0;
        if(n<2)
        return false;
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],a,i,count=0;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        x[i]=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(isprime(x[i]))
            count++;
        }
        System.out.println(count);
    }
}