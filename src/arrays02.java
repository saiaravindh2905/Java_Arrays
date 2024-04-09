import java.util.Scanner;
class arrays02
{
    static Scanner x = new Scanner(System.in);

            public static void main (String [] args)
            {
                System.out.println("Enter the length of array : ");
                int ln = x.nextInt();
                int []a = new int[ln];
                int values;

                for( int i = 0 ; i<a.length; i++)
                {
                    System.out.println("Enter the value in " +i+" index : ");
                    values = x.nextInt();
                    a[i]=values;
                }

                for (int j = 0 ; j<a.length ; j++)
                {
                    System.out.println("\n Index "+j+ " :"+a[j]);
                }

            }

}
