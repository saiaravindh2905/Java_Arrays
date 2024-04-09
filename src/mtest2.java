import java.util.Arrays;

class mtest2
{
    public static void main(String [] args)
    {
        int []a = {1,2,3,4,5,6,7,8};
        // b ( 1,8,2,7,3,6,4,5 ) */
        System.out.println("b = "+Arrays.toString(a)+"\n");

        int []b = new int[a.length];

        for(int i = 0 ,j=0 ; i<a.length-4; i++,j+=2 )
        {
             b[j]=a[i];

        }
        System.out.println(Arrays.toString(b));

        for(int k = a.length-1,l=1 ; k>=4 ; k--,l+=2)
        {
            b[l]=a[k];
        }

        System.out.println("b = "+ Arrays.toString(b));

    }

}
