import java.util.*;
//Binary Search
class array21
{
    static Scanner x = new Scanner(System.in);

            public static void main(String [] args)
            {
                int []a  = {14,16,18,24,30,34,80,84,86};
                String result = "Not Present";

                int low = 0, high = a.length-1,mid ;
                System.out.println("Enter the key element : ");
                int key = x.nextInt();

                while (high>=low)
                {
                    mid=(low+high)/2;

                   if (key==a[mid])
                   {
                       result = "Present";
                       break;
                   }
                   else if (key<a[mid])
                   {
                       high=mid-1;
                   }
                   else if(key>a[mid])
                   {
                       low=mid+1;
                   }

                }

                System.out.println("\t\t\t"+Arrays.toString(a));
                System.out.println(result);




            }



}
