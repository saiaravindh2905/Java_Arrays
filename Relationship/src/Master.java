import java.util.Scanner;

class Master
{
    static Scanner x = new Scanner(System.in);
    public static void guessNumber()
    {
        boolean rep = true;
       do {


           System.out.println("Guess the number\n");
           int a = (int) (Math.random() * 100);

           boolean res = true;
           do {
               System.out.println("Guess ..........");
               int guess = x.nextInt();

               if (guess < a) {
                   System.out.println("Low\n");
               } else if (guess > a) {
                   System.out.println("High\n");
               } else if (guess == a) {
                   System.out.println("IDENTIFIED\n\n");
                   res = false;
                   break;

               }

           } while (res);
           System.out.println("Play again  : y / n  (Case sensitive)");
           String select = x.next();
           if (select.equals("y"))
           {
               rep = true;
           }
           else if(select.equals("n"))
           {
               rep = false;
           }



       }while (rep);

    }

}

class Logic extends Master
{
    public static void PrintTable()
    {
        System.out.println("Enter a number to get multiplication table : ");
        int b = x.nextInt();

        for(int i = 1 ; i<=10 ; i++)
        {
            System.out.println(b+" x "+i+"="+(b*i));

        }

        System.out.println("");

    }




}
