public class boat
{
    int a =10;

     class water
     {

         int b = 20;

         class cold
         {
             int c = 30;

         }



     }


}

class b1
{
    public static void main(String[] args)
    {
        boat b = new boat();
        System.out.println(b.a);
        boat.water w = b.new water();
        System.out.println(w.b);
        boat.water.cold co = w.new cold();
        System.out.println(co.c);

    }


}