import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,sum=0,len=0,temp=0;
        n=sc.nextInt();
        temp=n;
        len=(int)(Math.log10(n)+1);
        while(n>0)
        {
            r=n%10;
            sum=sum+(int)Math.pow(r,len);
            len--;
            n=n/10;
            
        }
        if(sum==temp)
        System.out.println("True");
        else
        System.out.println("False");
    }
}