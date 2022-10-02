import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,b,c=0;
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
            t--;
        }
    }
}