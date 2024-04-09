import java.util.*;

class mtest1
{
    public static void main(String [] args)
    {

        int[]a = {1,2,3,4,5,6,7,8};

          // b ( 1,8,2,7,3,6,4,5 ) */

        int [] b = new int[a.length];
        System.out.println("b = "+Arrays.toString(b));

        for (int i = 0, j=0 , k = a.length-1 ;  i<b.length ; i++ )
        {
            if(i%2==0)
            {
                b[i]= a[j++];
            }
            else if(i%2!=0)
            {
                b[i]=a[k--];
            }
        }

        System.out.println("b result = "+Arrays.toString(b));


















    }



}
