import java.util.Arrays;

class missing_numbers
{
    public static void main(String [] args)
    {

        int []a = {4,7,10,12,8,13,17,19};
        Arrays.sort(a);

        for(int i=0 , n=1 ; i<a.length ; i++,n++)
        {
            if(a[i]!=n)
            {
                System.out.print(n+" ");
                i--;
            }


        }

    }


}
