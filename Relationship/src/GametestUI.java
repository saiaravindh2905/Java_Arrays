import java.util.Scanner;
class GametestUI
{
    static Scanner x = new Scanner(System.in);
    public static void main(String [] args)
    {
        boolean game = true;
        do {

            System.out.println("Select the Game: ");
            System.out.println("1.Guess the number \n2.Print the table\n3.Exit");
            int sc = x.nextInt();

            switch (sc)
            {
                case 1 : {
                    Logic.guessNumber();
                    break;}
                case 2 : {
                    Logic.PrintTable();
                    break;}
                case 3 : {
                    game=false;
                    System.out.println("Exiting....");
                    break;}

            }


        }while (game);

    }



}
