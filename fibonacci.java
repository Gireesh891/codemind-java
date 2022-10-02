import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,n,count=3,c=0;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(count<=n)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            count++;
            
        }
    }
}    
    