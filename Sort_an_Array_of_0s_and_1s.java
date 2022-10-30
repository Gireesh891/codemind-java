import java.util.Scanner;
import java.util.Arrays;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        Arrays.sort(x);
        for(int i=0;i<n;i++)
        {
        System.out.print(x[i]+" ");
        }
        
    }
}