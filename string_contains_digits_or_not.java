import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=0;
        t=sc.nextInt();
        while(t>0)
        {
            int found=0;
        String s1=sc.next();
        int a=s1.length();
        for(int i=0;i<a;i++)
        {
            if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
            {
                found=1;
            }
        }
        if(found==1)
        System.out.println("Yes");
        else
        System.out.println("No");
        t--;
        }
        
        
        
    }
}