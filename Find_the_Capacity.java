import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,k=0,T=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        k=2*a*b*c*512;
        T=k/1024;
        System.out.println(T+"KB");
    }
}