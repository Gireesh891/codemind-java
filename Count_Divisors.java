import java.util.Scanner;
class java
{
    public static int div(int a,int b,int c)
    {
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r,k,A;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        A=div(l,r,k);
        System.out.println(A);
        
    }
}