import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int V=0,C=0,D=0,W=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
            {
                V++;
            }
            else if(ch>=65 && ch<=90)
            {
                C++;
            }
            else if(ch>=97 && ch<=122)
            {
                C++;
            }
            else if(ch>=48 && ch<=57)
            {
                D++;
            }
            else if(ch==' ')
            {
                W++;
            }
           
        }
        System.out.println("Vowels: "+V);
        System.out.println("Consonants: "+C);
        System.out.println("Digits: "+D);
        System.out.println("White spaces: "+W);
        
    }
}