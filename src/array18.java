import java.util.Arrays;

class array18
{
    public static void main(String [] args)
    {
        int[]a ={8,1,2,4}, b={44,48,54,68};
        System.out.println("a = "+ Arrays.toString(a));
        System.out.println("b = "+ Arrays.toString(b));

        int []res = new int[a.length+b.length];

        for(int i = 0, j=0 ,k=b.length-1 ; i<res.length ; i++)
        {
            if (i%2==0)
            {
                    System.out.print(a[j]+",");
                    res[i]=a[j];
                    j++;
            }
            else if (i%2!=0)
            {
                System.out.print(b[k]+",");
                res[i]=b[k];
                k--;

            }



        }


        System.out.println("\n\nresult : "+ Arrays.toString(res));


    }


}
