import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        s1=sc.next();
        int a=s1.length();
        char ch[]=s1.toCharArray();
        for(int i=0;i<a;i++)
        {
            if(ch[i]=='.')
            {
                System.out.print("[.]");
            }
            if(ch[i]!='.')
            {
                System.out.print(ch[i]);
            }
        }
    }
}