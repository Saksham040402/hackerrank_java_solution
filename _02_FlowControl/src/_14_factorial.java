import java.util.Scanner;

public class _14_factorial
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int i=1;
        while(x>0)
        {
            i=i*x;
            x--;
        }
        System.out.println(i);
    }
}
