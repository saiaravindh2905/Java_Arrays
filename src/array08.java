import java.util.Arrays;
import java.util.Scanner;

//wajp to print the even elements and print the sum of the even elements
class array08
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
        int esum = 0, osum=0;

        for (int i =0 ; i<a.length ; i++)
        {
            if (a[i]%2==0 )
            {
                System.out.print(a[i]);
                esum = esum + a[i];
            }
            else
            {

                osum = osum + a[i];
            }

        }

        System.out.println("\nsum of Even elements array : "+esum);
        System.out.println("\nsum of Odd elements array : "+osum);



    }


}
