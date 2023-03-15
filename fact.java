import java.util.*;
class fact
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = s.nextInt(),f=1;
        for(int i=1;i<=n;i++)
        {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is " + f);
    }
}
