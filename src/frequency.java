import java.util.Arrays;
import java.util.Scanner;
class frequency
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        System.out.println("\nEnter the length of array : ");
        int[]a= new int[x.nextInt()];
        int count=1;

        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.println("Enter the "+i+" index value : ");
              a[i]=x.nextInt();
        }
        System.out.println(Arrays.toString(a));

        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = 0 ; j< a.length ; j++)
            {
                if(a[i]==a[j] & a[i]!=-1 & i!=j)
                {
                    a[j]=-1;
                    count++;
                }
            }
            if(a[i]!=-1) {
                System.out.println("The frequency of " + a[i] + " is : " + count);
                count = 1;
            }
        }

    }// main method

}// class
