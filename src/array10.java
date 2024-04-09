import java.util.Arrays;
import java.util.Scanner;
//print the sum of odd index array elements.
class array10
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        System.out.println("enter the length of the array : " );
        int []a = new int[x.nextInt()];

        for (int i = 0 ; i<a.length; i++ )
        {
            System.out.println("Enter the index of "+i+" :");
            a[i]=x.nextInt();

        }

        System.out.println(Arrays.toString(a));
        int sum = 0;

        for (int i = a.length-1 ; i>=0 ; i--)
        {
            if (i%2!=0 )
            {
                sum = sum+a[i];
                System.out.print(a[i]+",");
            }

        }

        System.out.println("\nsum of array : "+sum);

    }

}
