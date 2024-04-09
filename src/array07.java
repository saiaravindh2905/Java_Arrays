import java.util.*;
// reverse

class array07 {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = new int[a.length];

        for (int i =0,j=a.length-1 ; i< b.length ; i++,j--)
        {
            b[i]=a[j];
        }

        System.out.println(" A : "+ Arrays.toString(a));
        System.out.println(" B : "+ Arrays.toString(b));


    }


}