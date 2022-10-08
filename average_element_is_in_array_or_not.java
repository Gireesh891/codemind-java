import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],found=0,sum=0;
        float avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=(int)sum/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]==avg)
            {
               found=1;
                
            }
        }
        if(found==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
           
    }
}