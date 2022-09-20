import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0;
        n=sc.nextInt();
        a=(int)n*(n-3)/2;
        System.out.println(a);
    }
}