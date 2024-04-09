import java.util.*;
import java.util.Scanner;
// Linear Search
class array20
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args) {
        int[] a = {12, 15, 18, 12, 19, 45, 47, 18, 71, 84, 12, 15, 56};
        System.out.println("enter the searching value : ");
        int search = x.nextInt();
        System.out.println("Enter the occurrence : ");
        int occurrence = x.nextInt();
        int count = 0, i;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] == search)
            {
                count++;

                if(count==occurrence)
                {
                    break;
                }

            }

        }

        if (count == occurrence )
        {
            if(occurrence==2)
                System.out.println(occurrence + "nd occurrence of " + search + " is present in " + i);
            else if(occurrence==3)
                System.out.println(occurrence + "rd occurrence of " + search + " is present in " + i);
            else if (occurrence>3 && occurrence<21)
                System.out.println(occurrence + "th occurrence of " + search + " is present in " + i);
            else if(occurrence==1)
                System.out.println(occurrence + "st occurrence of " + search + " is present in " + i);
        }

        else if (count>0 && count<occurrence)
        {
            System.out.println("Key value "+search+" is presented , but the occurrence is LOW  " );
        }
        else
        {
            System.out.println("no key value is presented");
        }




    }



}

