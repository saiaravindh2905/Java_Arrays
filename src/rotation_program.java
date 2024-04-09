import java.util.*;
public class rotation_program
{ static Scanner x = new Scanner(System.in);
    public static void main(String [] args)
         {
             int[]a = {10,20,30,40};
             System.out.println("\t\t\t"+Arrays.toString(a)+"\n");
             System.out.println("Enter the n Value : ");
             int n = x.nextInt();

             for(int i = 1 ; i<=n ; i++)
             {
                 int first = a[0];
                 for( int j=0 ; j<a.length-1 ; j++)
                 {
                     a[j]=a[j+1];
                 }
                 a[a.length-1] = first;
             }
                System.out.println("\t\t\t"+Arrays.toString(a));

         }

}