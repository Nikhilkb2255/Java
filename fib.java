import java.util.*;
class fib
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = s.nextInt();
        int x1=0,x2=1,x3,i;
        System.out.println(x1);
        System.out.println(x2);

        for(i=2;i<n;i++)
        {
            x3 = x1 + x2;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;
        }
    }
}
