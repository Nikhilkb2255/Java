import java.util.*;
class madd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row size : ");
        int row = s.nextInt();
        System.out.println("Enter coloumn size : ");
        int cols = s.nextInt();
        int[][] mx1 = new int[row][cols];
        int[][] mx2 = new int[row][cols];
        int[][] sum = new int[row][cols];
        int i,j;

        System.out.println("Enter matrix-1 elements : ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<cols;j++)
            {
                mx1[i][j] = s.nextInt();
                // System.out.println();
            }
        }
        System.out.println("Enter matrix-2 elements : ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<cols;j++)
            {
                mx2[i][j] = s.nextInt();
                // System.out.println();
            }
        }
        System.out.println('\n');
        System.out.println("Sum is : ");
        for(i=0;i<row;i++)
        {
            System.out.println();
            for(j=0;j<cols;j++)
            {
                sum[i][j] = mx1[i][j] + mx2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
        }
    }
}