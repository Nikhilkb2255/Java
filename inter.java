import java.util.*;
 
interface shape
{
    void input();
    void area();
    void peri();
}

class circle implements shape
{
    int r=0;
    double pi=3.14, a=0, p=0;
    
    public void input()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("\nEnter radius : ");
        r = x.nextInt();
    }

    public void area()
    {
        a = pi*(r*r);
        System.out.println("\nArea of circle is "+a);
    }

    public void peri()
    {
        p = 2*(pi*r);
        System.out.println("\nPerimeter of circle is "+p);
    }
}

class rect extends circle
{
    int l=0, b=0;
    double a=0, p=0;
    
    public void input()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("\nEnter length : ");
        l = x.nextInt();
        System.out.println("\nEnter breadth : ");
        b = x.nextInt();
    }

    public void area()
    {
        a = l*b;
        System.out.println("\nArea of rectangle is "+a);
    }

    public void peri()
    {
        p = 2*(l+b);
        System.out.println("\nPerimeter of rectangle is "+p);
    }
}

public class inter
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Circle\n2.Rectangle\n3.Exit");
            System.out.println("Enter your Choice :");
            int ch = x.nextInt();
            switch(ch){
                case 1:
                    circle y = new circle();
                    y.input();
                    System.out.println("1.Area of Circle\n2.Perimeter of Circle");
                    System.out.println("Enter your Choice :");
                    ch = x.nextInt();
                    switch(ch){

                        case 1:
                            y.area();
                            break;

                        case 2:
                            y.peri();
                            break;
                    }

                    break;

                case 2:
                    rect z = new rect();
                    z.input();
                    System.out.println("1.Area of Rectangle\n2.Perimeter of Rectangle");
                    System.out.println("Enter your Choice :");
                    ch = x.nextInt();
                    switch(ch){

                        case 1:
                            z.area();
                            break;

                        case 2:
                            z.peri();
                            break;
                    }

                    break;

                case 3:
                    System.exit(0);
                    break;
                
                default:

                    System.out.println("Wrong Input");
                    break;
                    
                    
            }
        }
    }
}