import java.util.Scanner;
class java
{
    public static boolean ispalindrome(int a)
    {
        int rev=0,sum=0,temp=a;
        while(a>0)
        {
            rev=a%10;
            sum=sum*10+rev;
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
        int n,x[],count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(ispalindrome(x[i]))
           {
               count++;
           }
        }
        System.out.println(count);
        
        
    }
}