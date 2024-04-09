import java.util.*;
class recursionFibonacci
{
    static Scanner x = new Scanner(System.in);

        static  long n1 =0L, n2 =1L, n3 = 0L, limit;

             public static void main(String []args)
             {
                 System.out.println("Enter the limit :");
                 limit = x.nextLong();
                 System.out.print(n1+" "+n2+" ");
                 limit = limit-2;
                 fib();
                 System.out.println("\n"+fib());

             }

             public static String fib()
             {
                if(limit>=1) {
                    n3 = n1 + n2;
                    System.out.print(n3+" ");

                    n1 = n2;
                    n2 = n3;

                    limit--;

                  fib();

                }
                return "Completed";

             }


}
