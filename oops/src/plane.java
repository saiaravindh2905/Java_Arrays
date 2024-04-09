public class plane
{
    int a = 10;

       static class air
       {
           int b = 20;

            static class storm
            {
                int c = 30;

            }



       }


}

class p
{
    public static void main(String[] args)
    {

        plane p1 = new plane();
        System.out.println(p1.a);
        plane.air a1 = new plane.air();
        System.out.println(a1.b);
        plane.air.storm s1 = new plane.air.storm();
        System.out.println(s1.c);

    }


}