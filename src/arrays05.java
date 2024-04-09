// REVERSE THE ARRAY
/* create one more array of same size
store the elements from the last
 */
import java.util.*;
class arrays05
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

                  System.out.println("a = "+ Arrays.toString(a) );      // printing the assigned values of array
                  Thread.sleep(1050);

                  int b=0; //--------------------------------------------- it represents the index of 'a'
                  int [] reverse = new int[a.length];//------------------- assigning the new array variable 'reverse' with the length of a

                  for( int i = a.length-1 ; i>=0 ;i--)                  //reversing by using the length of the array 'a' in reverse
                  {
                      reverse[i]=a[b];      //
                      b++; // index of 'a' increases

                  }

                  System.out.println("reverse  = "+ Arrays.toString(reverse) );
                  Thread.sleep(1000);

                  System.out.println("*****************************");


         }

}
