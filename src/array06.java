import java.util.Arrays;
import java.util.Scanner;
class array06
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
        System.out.println(" Enter the length of array : ");
        int [] a = new int[x.nextInt()];                        // assigning length
        System.out.println("a = "+ Arrays.toString(a) );


        for (int i = 0 ; i<a.length; i++ )                     // assigning values for the array
        {
            System.out.println("Enter the index of "+i+" :");
            a[i]=x.nextInt();
        }

        Arrays.sort(a);

        System.out.println("a = "+ Arrays.toString(a) );      // printing the assigned values of array
        Thread.sleep(1050);

        int sum = 0;

           for ( int i = 0 ; i<a.length ; i++)
           {
               sum = sum + a[i];
           }

        System.out.println("The Sum of array data are : "+sum);

        System.out.println("*****************************");


    }



}
