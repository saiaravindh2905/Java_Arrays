import java.util.Arrays;
import java.util.Scanner;

class array12
{
    static Scanner x = new Scanner(System.in);

            public static void main(String [] args)
            {
                char []a = {'a','b','A','B','$'};

                int []b = new int[a.length];

                for (int i = 0 ; i<a.length ; i++)
                {
                    b[i]=a[i];
                }

                System.out.println("Character : "+Arrays.toString(a));
                System.out.println("Integer   : "+Arrays.toString(b));



            }


}
