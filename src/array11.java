import java.util.Arrays;
import java.util.Scanner;

class array11
{
    static Scanner x = new Scanner (System.in);

        public static void main(String [] args)
        {
            System.out.println("Enter the length of array : ");
            int []a = new int[x.nextInt()];
            int sum = 0;

            for(int i =0; i<a.length ; i++)
            {
                System.out.println("Enter the index "+i+" value : ");
                a[i]=x.nextInt();

            }

            System.out.println(Arrays.toString(a));
            
            for (int i = 0 ; i<a.length ; i++)
            {
                if(a[i]%5==0)
                {
                    if (i%2==0)
                    {
                        System.out.println(i+" = SQL");
                    }
                    else
                    {
                        System.out.println(i+" = JAVA");
                    }

                    sum= sum+i;

                }

            }

            System.out.println("sum is :"+sum );
            int sumofdigitalindex=0;
            int last;

            while(sum>0)
            {
                last =  sum%10;
                sumofdigitalindex = sumofdigitalindex + last;

                sum/=10;

            }
            System.out.println("Digital sum of index : "+sumofdigitalindex);

        }


}
