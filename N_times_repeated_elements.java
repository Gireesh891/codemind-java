import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,count=0,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
                if(a==count)
                {
                    System.out.print(x[i]+" ");
                    flag++;
                }
            }
        }
        if(flag==0)
        System.out.println("-1");
    }
}