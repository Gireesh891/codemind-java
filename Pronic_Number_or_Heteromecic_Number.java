import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,found=0;
        a=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            if(i*(i+1)==a)
            {
                found=1;
                break;
            }
        }
        if(found==1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}