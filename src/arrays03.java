import java.util.Scanner;

class arrays03
{
   static Scanner x  = new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size of array : ");
        int [] a = new int[x.nextInt()];

        //Inserting
        for (int i = 0 ; i<a.length ; i++)
        {
            System.out.println("Enter the value of index  "+i+" : ");
            a[i]= x.nextInt();

        }


    }


}
