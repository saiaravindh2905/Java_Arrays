import java.util.Arrays;
import java.util.Scanner;

class removeduplicate
{
    static Scanner x = new Scanner(System.in);
    public static void main(String [] args)
    {
        int []a = {16,14,13,16,8,2,14,44,8};
        System.out.println(Arrays.toString(a)); 
        Arrays.sort(a);
        System.out.println("a : "+Arrays.toString(a));

        int[]b = new int[a.length];
        int j = 0;

        for(int i = 0; i<a.length-1 ; i++)
        {
            if(a[i]!=a[i+1])
            {
               b[j]=a[i];
               j++;
            }
        }

        if (a[a.length-1]!=a[a.length-2]) // if a[last] is not equal to a[2nd last]\
        {
            b[j]=a[a.length-1];
            j++;
        }
        System.out.println("b :"+Arrays.toString(b));
        System.out.println(j);
        int []c = new int[j];
        for(int i =0 ; i<j ;i++)
        {
            c[i]=b[i];
        }
        System.out.println(Arrays.toString(c));

/*
        System.out.println("\t\tSelect the function ");
        System.out.println("1.nth Maximum number \n2. nth Minimum number");
        int s = x.nextInt();
        switch (s)
        {
            case 1 : {
                System.out.println("nth Maximum numbers ** \n\n");
                System.out.println("enter the n value :");
                int n = x.nextInt();

                System.out.println(c[c.length-n]);
                break;}

            case 2 : {
                System.out.println("nth Minimum numbers ** \n\n");
                System.out.println("enter the n value :");
                int n = x.nextInt();

                System.out.println(c[n-1]);
                break;
            }

        }

       */




    }



}
