import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int f=0;
        s1=sc.next();
        s2=sc.next();
        long a=Long.valueOf(s1);
        long b=Long.valueOf(s2);
        System.out.println(a*b);
    }
}