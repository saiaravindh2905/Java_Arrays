import java.util.Arrays;
import java.util.Scanner;

public class array23
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        for(int i = 0 ; i<a.length; i++) // for inserting
        {
            for (int j = 0 ; j<a[i].length  ; j++)
            {
                System.out.println("Enter the value of outer index "+i+" and inner index "+j+ " : ");
                a[i][j]=x.nextInt();
            }

        }
        for(int i = a.length-1 , k = 0; i>=0; i--,k++) // for inserting B
        {
            for (int j = a[i].length-1 , l =0; j>=0  ; j--,l++)
            {
                b[k][l]=a[i][j];
            }
        }
        for(int i = 0 ; i<b.length; i++)//
        {
            System.out.println(Arrays.toString(b[i]));
        }

    }

}
