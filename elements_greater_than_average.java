import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,avg=0,sum=0,count=0;
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
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
        if(avg<=x[i])
        {
        count++;
        }
        }
        System.out.println(count);
           
    }
}