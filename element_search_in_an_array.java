import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(x[i]==a)
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