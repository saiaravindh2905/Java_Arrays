import java.util.Arrays;
import java.util.Scanner;

class array09
{
//print only the even index elements and the sum of even index elements.
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

        for (int i =0 ; i<a.length ; i++)
        {
            if (i%2==0)
            {
                System.out.print(a[i]+" ");
                sum = sum + a[i];
            }

        }

        System.out.println("\nsum of array : "+sum);


                         /*
                          int r[][] = new int[x.nextInt()][x.nextInt()];

                            for(int i = 0 ; i<r.length ; i++) {
                                System.out.println(Arrays.toString(r[i]));
                            }
                          */

    }

}
