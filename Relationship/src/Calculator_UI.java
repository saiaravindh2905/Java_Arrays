import java.util.Scanner;

class Calculator_UI extends Calci
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args) {


        boolean repeat = true;
        do
        {
            System.out.println("Calculator");
            System.out.println(" Select the input ");
            System.out.println("1.ADDITION \n2.SUBTRACTION \n3.MULTIPLICATION \n4.DIVISION \n5.EXIT");
            int sc = x.nextInt();


            switch (sc)
            {
                case 1: {
                    System.out.println("Addition");
                    System.out.println("Enter 2 numbers to add");
                    System.out.println("Enter A : ");
                    a = x.nextInt();
                    System.out.println("Enter B : ");
                    b = x.nextInt();
                    System.out.println(add(a, b));

                    break;
                }
                case 2: {
                    System.out.println("SUBTRACTION");
                    System.out.println("Enter 2 numbers to subtract");
                    System.out.println("Enter A : ");
                    a = x.nextInt();
                    System.out.println("Enter B : ");
                    b = x.nextInt();
                    System.out.println(sub(a, b));

                    break;
                }
                case 3: {
                    System.out.println("MULTIPLICATION");
                    System.out.println("Enter 2 numbers to Multiply");
                    System.out.println("Enter A : ");
                    a = x.nextInt();
                    System.out.println("Enter B : ");
                    b = x.nextInt();
                    System.out.println(Multi(a, b));

                    break;
                }
                case 4: {
                    System.out.println("DIVISION");
                    System.out.println("Enter 2 numbers to sub");
                    System.out.println("Enter A : ");
                    a = x.nextInt();
                    System.out.println("Enter B : ");
                    b = x.nextInt();
                    System.out.println(Division(a, b));

                    break;
                }
                case 5:
                    repeat = false;
                    break;
            }


        }while(repeat);

    }


}



