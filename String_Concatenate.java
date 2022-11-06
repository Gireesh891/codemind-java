import java.util.Scanner;
import java.util.Arrays;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        String S=s1+s2;
        char M[]=S.toCharArray();
        Arrays.sort(M);
        String B=new String(M);
        System.out.println(B);
        
        
        
        
        
        
    }
}