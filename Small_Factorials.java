import java.util.Scanner;
class java
{
    public static int factorial(int n)
    {
        int pro=1;
        for(int i=n;i>=1;i--)
        {
            pro=pro*i;
        }
        return pro;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k,t,result=0;
        t=sc.nextInt();
        while(t>0)
        {
            k=sc.nextInt();
            result=factorial(k);
            System.out.println(result);
            t--;
        }
        
    }
}