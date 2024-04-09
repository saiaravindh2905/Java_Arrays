import java.util.Arrays;

class MergeAllArrays
{
    public static void main(String [] args)
    {
        int[]a = {10,20,30},b ={40,50,60}, c={70,80,90,100};

        int [] res = new int[a.length + b.length + c.length ];

        for(int i = 0 , j=0 , k=b.length-1, l=0 ; i< res.length ; i++ )
        {
            if(j<a.length)
            {
                res[i]=a[j++];
            }
            else if (k>=0)
            {
                res[i]=b[k--];
            }
            else if(l<c.length)
            {
                res[i]=c[l++];
            }

        }

        System.out.println(Arrays.toString(res));

    }
}
