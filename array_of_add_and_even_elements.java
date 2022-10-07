import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,even[],odd[],j=0,k=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
        x[i]=sc.nextInt();
        }
        odd=new int[n];
        even=new int[n];
        for(int i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
                odd[j++]=x[i];
            }
            else
            {
                even[k++]=x[i];
            }
        }
        for(int i=0;i<j;i++)
        System.out.print(odd[i]+" ");
        for(int i=0;i<k;i++)
        System.out.print(even[i]+" ");
    }
}