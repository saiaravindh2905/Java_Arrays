import java.util.Arrays;

public class bubblesort
{
    public static void main(String [] args)
    {
        int []a = { 99 , -3 , -78 , 23 , 14 , 56 , 12 , 14 };
        System.out.println(Arrays.toString(a));

        for(int i = 0 ; i<a.length-1 ; i++)
        {
            for(int j = 0; j<a.length-1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }

        }

        System.out.println(Arrays.toString(a));

    }

}
