import java.util.Arrays;
import java.util.Scanner;

// Creating ,Inserting and Printing of Multi Dimension Arrays

public class sample1
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        int[][] a = new int[3][3];

        for(int i = 0 ; i<a.length; i++) // for inserting
        {
            for (int j = 0 ; j<a[i].length  ; j++)
            {
                System.out.println("Enter the value of outer index "+i+" and inner index "+j+ " : ");

                a[i][j]=x.nextInt();

            }

        }

        for(int i = 0 ; i<a.length; i++)// for printing method - 1
        {
            for (int j = 0 ; j<a[i].length  ; j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println(" ");

        }
        System.out.println("\n\n");

        for(int i = 0 ; i<a.length; i++)// for printing method - 2
        {
            System.out.println(Arrays.toString(a[i]));

        }




    }

}
