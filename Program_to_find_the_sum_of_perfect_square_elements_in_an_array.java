import java.util.Scanner;
class java
{
    public static boolean isper(int a)
    {
        int b=0,c=0;
        b=(int)Math.sqrt(a);
        c=(int)Math.pow(b,2);
        if(c==a)
        {
            return true;
        }
        else
        {
        return false;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isper(x[i]))
            {
                sum=sum+x[i];
                
            }
        }
        System.out.println(sum);
            
          
        
        
        
    }
}