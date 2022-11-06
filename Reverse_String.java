import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=s1.length();
        char ch[]=s1.toCharArray();
        for(int i=a-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        
        
        
    }
}