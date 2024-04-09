import java.util.*;
class duplicate_elements
{
    public static void main(String [] args)
    {
        int[]a ={8,4,16,8,5,2,16,8};

        for(int i=0 ; i< a.length ; i++)
        {
            int count = 0;

            for(int j = i+1 ; j< a.length ; j++)
            {
                if(a[i]==a[j] && a[i]!=-1)
                {
                    count++;
                    a[j]=-1;
                }

            }


            if(count>0)
                System.out.println(a[i]);

        }







    }




}
