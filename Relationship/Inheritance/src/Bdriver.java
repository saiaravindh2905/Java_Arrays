import java.util.Scanner;

public class Bdriver
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        SavingsAccount sa = new SavingsAccount("Suresh",23,9876543210L,82345613,"State Bank Of India","Vadapalani",52416352);
        CurrentAccount ca = new CurrentAccount("Mahesh",21,7898765432L,82405620,"State Bank Of India","Vadapalani",23416300);

        boolean me = true;
        do
        {

            System.out.println("\n\t\t\t--- WELCOME TO INTERNET BANKING ---\n\n");
            System.out.println("Select the Input");
            System.out.println("1. Savings Account \n2. Current Account \n3. Exit");

            int mbt = x.nextInt();

            switch (mbt) {

                case 1:
                {

                    boolean sac = true;
                    do
                    {

                        System.out.println(" ** Savings Account ** ");
                        System.out.println("Select the Input");
                        System.out.println("1. Deposit Amount \n2. Withdraw Amount \n3. Details of Account \n4. Check Balance \n5. Exit");
                        int sbt = x.nextInt();

                        switch (sbt) {
                            case 1: {
                                System.out.println("Enter the amount to deposit : ");
                                sa.Deposit(x.nextDouble());
                                break;
                            }
                            case 2: {
                                System.out.println("Enter the amount to Withdraw : ");
                                double wd = x.nextDouble();
                                if(sa.getBalance()>=wd) {
                                    sa.Withdraw(wd);
                                    System.out.println("Withdrawn Successful\n");
                                }
                                else
                                    System.out.println("Insufficient Balance\n");


                                break;
                            }
                            case 3: {
                                sa.DetailsofSA();
                                break;
                            }
                            case 4: {
                                System.out.println( sa.getBalance());
                                break;
                            }
                            case 5: {
                               sac = false;
                                break;
                            }


                        } // saving account switch

                    }while (sac);

                    break;
                } // case 1 = Savings account switch ends


                case 2: {


                    boolean cac = true;
                    do
                    {

                        System.out.println(" ** Current Account ** ");
                        System.out.println("Select the Input");
                        System.out.println("1. Deposit Amount \n2. Withdraw Amount \n3. Details of Account \n4. Check Balance \n5. Exit");
                        int sbt = x.nextInt();

                        switch (sbt) {
                            case 1: {
                                System.out.println("Enter the amount to deposit : ");
                                ca.Deposit(x.nextDouble());
                                break;
                            }
                            case 2: {
                                System.out.println("Enter the amount to Withdraw : ");
                                double wd = x.nextDouble();
                                if(ca.getBalance()>=wd) {
                                    ca.Withdraw(wd);
                                    System.out.println("Withdrawn Successful\n");

                                }

                                else
                                    System.out.println("Insufficient Balance\n");


                                break;
                            }
                            case 3: {
                                ca.DetailsofCA();
                                break;
                            }
                            case 4: {
                                System.out.println(ca.getBalance());
                                break;
                            }
                            case 5: {
                                cac = false;
                                break;
                            }


                        } // current account switch

                    }while (cac);



                    break;
                } // case 2 = current account switch ends


                case 3:
                {
                    me = false;
                    break;
                } // case 3 : main switch =  exit


            }// main switch ends


        }while (me);


    }// main ends

}// class ends