import java.util.ArrayList;
import java.util.Arrays;

class testfile
{
    public static void main(String [] args)
    {
        ArrayList a1 = new ArrayList<>();
        a1.add("Sai"); // to add element
        a1.add(8124898802L);
        a1.add("Salem");
        a1.add(null);
  /*
        System.out.println(a1);

        for(int i = 0 ; i<4 ; i++)
        {
            System.out.println(a1.get(i));

        }

        System.out.println(a1.contains(1));
        System.out.println(a1.get(1)); // to get the element based on index
        System.out.println(a1.remove(1)); // to remove the element based on index
        System.out.println(a1); // to print the arraylist



    */

        ArrayList a2 = new ArrayList<>();
        a2.add("Ramya");
        a2.add(9159781048L);
        a2.add("Thiruvarur");
        a2.add(null);

        System.out.println(a2);

        a1.addAll(a2);
        System.out.println(a1);




    }


}
