import java.util.Scanner;
class java
{
    public static int ispalindrome(int a)
    {
        int rev=0,sum=0;
        while(a!=0)
        {
            rev=a%10;
            sum=sum*10+rev;
            a=a/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],result=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           result=ispalindrome(x[i]);
           {
               System.out.print(result+" ");
           }
        }
        
        
    }
}