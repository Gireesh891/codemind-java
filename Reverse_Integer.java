import java.util.Scanner;
class java
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,n;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println(sum);
        
    }
}