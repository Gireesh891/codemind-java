import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],E=0,O=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                E++;
            }
            else
            {
                O++;
            }
        }
        System.out.println(E+" "+O);
    }
}