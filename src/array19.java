import java.util.Scanner;

class array19
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        int []a ={12,15,18,22,19};
        System.out.println("enter the searching value : ");
        int search = x.nextInt();
        String check="Not Present";

        for(int i=0 ; i<a.length; i++)
        {
            if(a[i]==search)
            {
                check="Present";

                break;
            }



        }

        System.out.println(check);

    }
}
