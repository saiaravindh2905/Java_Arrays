class Testing
{
    public static void main(String[] args)
    {


       /* String b = "Hello World this is Java";
        System.out.println(b); */




     /*   for (int i = 0 ; i<b.length() ; i++)
        {

            if(b.charAt(i)!=' ')
            {
                count++;
            }

        }

        System.out.println(count); */



      /*  for (int i =0 ; i<b.length() ; i++)
        {
            if(b.charAt(i)!=' ')
            {
                count++;


               if(b.charAt(i)>='A' && b.charAt(i)<='Z')
               {
                   ucc++;
               }
               else if (b.charAt(i)>='a' && b.charAt(i)<='z')
               {
                   lcc++;
               }



            }


        }


        double up = (ucc*100)/count;
        double lp = (lcc*100)/count;
        System.out.println(count);
        System.out.println(ucc);
        System.out.println(lcc);
        System.out.println("upper percentage : "+up);
        System.out.println("Lower percentage : "+lp);

     */

      /* int count=5;
       int a = 1;

        for (int i = 1 ; i<=5 ;i++)
        {
            for (int j = 0; j<5; j++)
            {
                if(count!=a)
                {
                    System.out.print(" ");
                }
                else if(count==a)
                {
                    System.out.print("*");
                    a--;
                }
                a++;


            }
             count--;
             a=1;

              System.out.println(" ");

        }*/

        int count=1;
        int a = 5;

        for (int i = 1 ; i<=5 ;i++)
        {
            for (int j = 0; j<5; j++)
            {
                if(count!=a)
                {
                    System.out.print(" ");
                }
                else if(count==a)
                {
                    System.out.print("*");
                    a++;
                }
                a--;


            }
            count++;
            a=5;

            System.out.println(" ");

        }



    }

}