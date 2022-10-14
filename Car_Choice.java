import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        float a,b,c,d;
        double e,f;
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            d=sc.nextFloat();
            e=c/a;
            f=d/b;
            if(e<f)
            {
                System.out.println("-1");
            }
            else if(e>f)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
            t--;
            
        }
    }
}