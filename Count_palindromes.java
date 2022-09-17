import java.util.Scanner;
class java
{
    public static boolean ispalindrome(int n)
    {
        int sum=0,r,temp=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
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
            if(ispalindrome(x[i]))
            count++;
            
        }
        System.out.println(count);
    }
}