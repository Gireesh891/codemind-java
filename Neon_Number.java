import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=0,sum=0,c=0,temp=0;
        a=sc.nextInt();
        temp=a;
        b=(int)(Math.pow(a,2));
        while(b>0)
        {
            c=b%10;
            sum=sum+c;
            b=b/10;
            
        }
        if(sum==temp)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
        
        
    }
}