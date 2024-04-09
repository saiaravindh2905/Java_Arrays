import java.util.Arrays;

class remdup
{
         public static void main(String [] args)
         {
             int []a = {10,5,8,9,8,4,15,4,17,19,12,12,15,6};
             System.out.println(Arrays.toString(a));
             Arrays.sort(a);

             System.out.println(Arrays.toString(a));

             int[]b = new int[a.length];

             int j = 0;

             for(int i = 0 ; i<a.length-1 ; i++)
            {
                if(a[i]!=a[i+1])
                {
                    b[j]=a[i];
                    j++;
                }

            }

             if (a[a.length-1]!=a[a.length-2])
             {
                b[j]=a[a.length-1];
                j++;
             }
             System.out.println(Arrays.toString(b));

             System.out.println(j);

             int []c = new int[j];

             for (int i = 0; i<j; i++)
             {
                 c[i]=b[i];
             }
             System.out.println(Arrays.toString(c));




         }


}
