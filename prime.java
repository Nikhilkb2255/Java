import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = s.nextInt(), flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println(n +" is prime");
        }
        else
        {
            System.out.println(n +" is not prime");
        }
    }
}
