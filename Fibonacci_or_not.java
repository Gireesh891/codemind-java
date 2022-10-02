import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0,n,found=0;
        n=sc.nextInt();
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                found=1;
                break;
                
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(found==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}