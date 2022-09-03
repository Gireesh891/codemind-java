import java.util.Scanner;
class java
{
    public static boolean ispalindrome(int a)
    {
        int r,sum=0;
        int temp=a;
        while(a>0)
        {
            r=a%10;
            sum=sum*10+r;
            a=a/10;
        }
        if(sum==temp)
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
        for(int i=n;i<=m;i++)
        {
            if(ispalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
        

}