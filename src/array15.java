import java.util.Arrays;
import java.util.*;   // Character uppercase to lowecase amd lowercase to Uppercase changing and printing
class array15
{
    static Scanner x = new Scanner (System.in);

    public static void main(String [] args)
    {

        char []a = {'A','a','5','d','$'};


        for(int i = 0 ; i<a.length ; i++)
        {
            if (a[i]>='A' && a[i]<='Z')
            {
                System.out.println(a[i]+=32);
            }
            else if (a[i]>='a' && a[i]<='z')
            {
                System.out.println(a[i]-=32);
            }
            else if (a[i]>='0' && a[i]<='9')
            {
                System.out.println(" ");
            }
            else
            {
                System.out.println("%");
            }

        }



        System.out.println("******************************");




    }



}
