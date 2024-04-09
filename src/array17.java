import java.util.Arrays; // merging all the arrays in one array

class array17
{
    public static void main(String []args)
    {
        int[]a={10,20,30,40},b={14,15,16,17},c={19,29,21,22},d={41,42,43};
        int[]result=new int[a.length+ b.length+ c.length+ d.length];

        for(int i=0,  j=0,   k=b.length-1,   l=0,  m=d.length-1 ; i< result.length ; i++)
        {
            if (j<a.length)
            {
              result[i]=a[j++];
            }
            else if (k>=0)
            {
             result[i]=b[k--];
            }
            else if (l<c.length)
            {
             result[i]=c[l++];
            }
            else if(m>=0)
            {
              result[i]=d[m--];
            }

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(result));

    }

}
