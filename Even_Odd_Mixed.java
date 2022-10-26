import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rev=0,e=0,od=0;
        a=sc.nextInt();
        while(a>0)
        {
            rev=a%10;
            if(rev%2==0)
            e++;
            else
            od++;
            a=a/10;
        }
        if(e>=1 && od==0)
        {
            System.out.println("Even");
        }
        else if(od>=1 && e==0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
        
    }
}