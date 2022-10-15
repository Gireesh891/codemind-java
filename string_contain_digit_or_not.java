import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
                char ch=s1.charAt(i);
                if(ch>=48 && ch<=57)
                {
                    count++;
                }
        }
        if(count==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.println("Contains "+count+" "+"digit");
        }
    }
}