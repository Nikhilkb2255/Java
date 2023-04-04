import java.util.Scanner;
class bsort
{
	public static void main(String []args)
    {
    int num=5,swap,i,j;
    int array[] = new int[num];
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements : ");
    num = s.nextInt();
    
    System.out.println("Enter " + num + " integers");
    for(i = 0;i<num;i++)
    {
		array[i] = s.nextInt();
    }

        for(i = 0;i<(num-1);i++)
        {
			for (j = 0;j< num-i-1;j++)
            {
				if(array[j] > array[j+1])
                {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
	
    
    System.out.println("After sorting: ");
    for(i = 0;i<num;i++)
    {
		System.out.println(array[i]);
	}
	}
}
