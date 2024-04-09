import java.util.Arrays;
import java.util.Scanner;

class array13
{
    public static void main(String [] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int[]a = new int[x.nextInt()];


        for (int i = 0 ; i<a.length ; i++)
        {
            System.out.println("enter the "+i+" index value :");
            a[i]=x.nextInt();
        }
        System.out.println(Arrays.toString(a));


        int i=0;
        int max = a[i];

        for(i = 0 ; i<a.length ; i++)
        {
            if(a[i]>max)
            {
                max=a[i];

            }

        }

        System.out.println("The Maximum value in the Array is : "+max);

    }

}
