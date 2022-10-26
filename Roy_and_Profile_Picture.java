import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,t;
        a=sc.nextInt();
        t=sc.nextInt();
        while(t>0)
        {
            int b,c;
            b=sc.nextInt();
            c=sc.nextInt();
            if(b<a || c<a)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(b==c)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
            t--;
            
        }
           
        
    }
}