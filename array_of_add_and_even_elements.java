import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,j;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
                System.out.print(x[i]+" ");
            }
        }
        for(j=0;j<n;j++)
        {
            if(x[j]%2==0)
            {
                System.out.print(x[j]+" ");
            }
        }
        
    }
}