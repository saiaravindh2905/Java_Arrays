import java.util.*;

class array04      // copying from one array variable to another array variable
{
    static Scanner x = new Scanner(System.in);

            public static void main (String [] args)
            {
                int []a = {15,30,45,60,75,90};
                System.out.print("a = "+ Arrays.toString(a) );
                int []b = new int[a.length];
                System.out.print("\nb = "+ Arrays.toString(b) );


                for( int i = 0 ; i<a.length ; i++ )
                {
                    b[i] = a[i];
                }

                System.out.println("\nb = "+ Arrays.toString(b) );

            }


}