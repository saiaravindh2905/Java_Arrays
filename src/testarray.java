import java.util.*;
class testarray
{
    static Scanner x = new Scanner (System.in);

        public static void main(String []args)
        {

            System.out.println("Enter the MDA count :");
            int r = x.nextInt();
            System.out.println("Enter the length of each array : ");
            int c = x.nextInt();

            int [][]a = new int[r][c];



            for(int i = 0 ; i<a.length ; i++)
            {
                for(int j = 0 ; j<a[i].length ; j++)
                {
                    System.out.println("Enter the "+i+" of "+j+" index value : ");
                    a[i][j]= x.nextInt();

                }


            }


           for(int i = 0 ; i<a.length ; i++) {
               System.out.println(Arrays.toString(a[i]));
           }






        }




}

