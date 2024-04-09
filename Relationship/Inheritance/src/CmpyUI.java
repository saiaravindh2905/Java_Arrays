import java.util.Scanner;

public class CmpyUI
{
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args)throws Exception
    {
        boolean mbt = true;
        do {


            System.out.println("\n\t\t\t\tOrganisation Portal");
            Thread.sleep(550);
            System.out.println("\nSelect Any Option");
            Thread.sleep(500);
            System.out.println("1. Hire Developers \n2. Hire Test Engineers \n3. Details OF Developers \n4. Details OF Test Engineers " +
                    "\n5. Get Info  \n6. Set Info   \n7. Exit   ");
            int sb = x.nextInt();


            switch (sb) {

                case 1:
                { boolean case1= true;
                   do {

                       Developer.CD();
                       System.out.println("1.Create again \n TO Exit....presss any number [ EXCEPT 1 :) ] ");
                       int button = x.nextInt();
                       if(button==1)
                       {
                           case1=true;
                       }
                       else
                       {
                           case1=false;
                       }


                   }while (case1);

                   break;
                }


                case 2:
                {
                    boolean case1= true;
                    do {

                        TestEngineer.CTE();
                        System.out.println("1.Create again \n TO Exit....presss any Number [ EXCEPT 1 :) ] ");
                        int button = x.nextInt();
                        if(button==1)
                        {
                            case1=true;
                        }
                        else
                        {
                            case1=false;
                        }


                    }while (case1);

                    break;

                }

                case 3:
                {
                    boolean case3=true;

                    do {


                        System.out.println(" \n\t\t Details of Developer \n");
                        System.out.println("Select your input");
                        System.out.println("1. List of Developers \n2. Specific Developer details \n3. exit");
                        int Dod = x.nextInt();

                        switch (Dod) {
                            case 1: {
                                for (int i = 0; i < Developer.developers.length; i++) {
                                    System.out.println("******************");
                                    Developer.developers[i].DetailsOFCompany();
                                    System.out.println(Developer.developers[i].getEid());
                                    System.out.println(Developer.developers[i].getContact());
                                    System.out.println("********************\n");

                                }

                                System.out.println("\n\n");

                                break;
                            }

                            case 2: {
                                System.out.println("Enter the contact number : ");
                                long user_contact = x.nextLong();

                                for (int i = 0; i < Developer.developers.length; i++) {
                                    if (Developer.developers[i].getContact() == user_contact)
                                    {
                                        Developer.developers[i].DetailsOFDeveloper();
                                    }
                                    

                                }

                                System.out.println("\n*********************");
                                System.out.println("\n\n");

                                break;
                            }

                            case 3:
                            {
                                case3=false;
                                break;
                            }


                        }

                    }while (case3);


                            break;
                } // Exiting details of Developers



                case 4:
                {
                   boolean case4=true;

                   do {


                       System.out.println(" \n\t\t Details of Test Engineer \n");
                       System.out.println("Select your input");
                       System.out.println("1. List of Test Engineer \n2. Specific Test Engineer details \n3. exit");
                       int Dod = x.nextInt();

                       switch (Dod) {
                           case 1: {
                               for (int i = 0; i < TestEngineer.testEngineers.length; i++) {
                                   System.out.println("******************");
                                   TestEngineer.testEngineers[i].DetailsOFCompany();
                                   System.out.println(TestEngineer.testEngineers[i].getEid());
                                   System.out.println(TestEngineer.testEngineers[i].getContact());
                                   System.out.println("********************\n");

                               }

                               System.out.println("\n\n");

                               break;
                           }

                           case 2: {
                               System.out.println("Enter the contact number : ");
                               long user_contact = x.nextLong();

                               for (int i = 0; i < TestEngineer.testEngineers.length; i++) {
                                   if (TestEngineer.testEngineers[i].getContact() == user_contact) {
                                       TestEngineer.testEngineers[i].DetailsOFTestEngineer();
                                   }

                               }

                               System.out.println("\n*********************");
                               System.out.println("\n\n");

                               break;
                           }

                           case 3: {

                               case4=false;
                               break;
                           }


                       }
                   }while (case4);

                    break;
                }// Exiting details of test engineers

                case 5:
                {
                   boolean case5=true;
                   do
                   {


                       System.out.println("\n\t\t\t ***  Get Info  ***");
                       System.out.println("1. Get Developer Info  \n2. Get Test Engineer Info \n3. Exit");
                       int gi = x.nextInt();


                       switch (gi) {
                           case 1: {

                               System.out.println(" -- Developer Info -- ");
                               System.out.println("Enter the contact details of Developer : ");
                               long u_c = x.nextLong();

                               for (int i = 0; i < Developer.developers.length; i++) {
                                   if (Developer.developers[i].getContact() == u_c) {
                                       boolean dtk = true;
                                       do {


                                           System.out.println("Details to know :");
                                           System.out.println("1. Get EID \n2. Get SALARY\n3. Exit");
                                           int bt1 = x.nextInt();

                                           switch (bt1) {
                                               case 1: {
                                                   System.out.println(Developer.developers[i].getEid());
                                                   break;
                                               }

                                               case 2: {
                                                   System.out.println(Developer.developers[i].getSal());
                                                   break;
                                               }
                                               case 3: {
                                                   dtk = false;
                                                   break;
                                               }

                                           }

                                       } while (dtk);


                                   }


                               }


                               break;
                           }

                           case 2: {


                               System.out.println(" -- Test Engineer Info -- ");
                               System.out.println("Enter the contact details of Test Engineer : ");
                               long u_c = x.nextLong();

                               for (int i = 0; i < TestEngineer.testEngineers.length; i++) {
                                   if (TestEngineer.testEngineers[i].getContact() == u_c) {
                                       boolean dtk = true;
                                       do {


                                           System.out.println("Details to know :");
                                           System.out.println("1. Get EID \n2. Get SALARY\n3. Exit");
                                           int bt1 = x.nextInt();

                                           switch (bt1) {
                                               case 1: {
                                                   System.out.println(TestEngineer.testEngineers[i].getEid());
                                                   break;
                                               }

                                               case 2: {
                                                   System.out.println(TestEngineer.testEngineers[i].getSal());
                                                   break;
                                               }
                                               case 3: {
                                                   dtk = false;
                                                   break;
                                               }

                                           }

                                       } while (dtk);


                                   }


                               }

                               break;

                           }

                           case 3: {
                               case5=false;
                               break;
                           }


                       }


                   }while (case5);


                    break;
                }


                case 6:
                {
                    boolean case6=true;
                    do
                    {


                        System.out.println("\n\t\t\t ***  Set Info  ***");
                        System.out.println("1. Set Developer Info  \n2. Set Test Engineer Info \n3. Exit");
                        int gi = x.nextInt();


                        switch (gi)
                        {
                            case 1:
                            {

                                System.out.println(" -- Developer Info -- ");
                                System.out.println("Enter the contact details of Developer : ");
                                long u_c = x.nextLong();

                                for (int i = 0; i < Developer.developers.length; i++)
                                {
                                    if (Developer.developers[i].getContact() == u_c)
                                    {

                                        boolean dtk = true;
                                        do
                                        {


                                            System.out.println("Details to know :");
                                            System.out.println("1. SET EID \n2. SET CONTACT \n3. Exit");
                                            int bt1 = x.nextInt();

                                            switch (bt1)
                                            {
                                                case 1:
                                                {

                                                    System.out.println("Enter the new EID :  ");
                                                    int user_eid=x.nextInt();
                                                    Developer.developers[i].setEid(user_eid);
                                                    break;
                                                }

                                                case 2:
                                                {

                                                    System.out.println("Enter the new CONTACT :  ");
                                                    long user_con = x.nextLong();
                                                    Developer.developers[i].setContact(user_con);
                                                    break;
                                                }
                                                case 3:
                                                {
                                                    dtk = false;
                                                    break;
                                                }


                                            }


                                        } while (dtk);


                                    }


                                }


                                break;
                            }

                            case 2:
                            {
                                System.out.println(" -- Test Engineer Info -- ");
                                System.out.println("Enter the contact details of Test Engineer : ");
                                long u_c = x.nextLong();

                                for (int i = 0; i < TestEngineer.testEngineers.length; i++)
                                {
                                    if (TestEngineer.testEngineers[i].getContact() == u_c)
                                    {
                                        boolean dtk = true;
                                        do
                                        {
                                            System.out.println("Details to know :");
                                            System.out.println("1. SET EID \n2. SET CONTACT\n3. Exit");
                                            int bt1 = x.nextInt();

                                            switch (bt1)
                                            {
                                                case 1:
                                                {
                                                    System.out.println("Enter the new EID :  ");
                                                    int user_eid=x.nextInt();
                                                    TestEngineer.testEngineers[i].setEid(user_eid);
                                                    break;
                                                }

                                                case 2:
                                                {
                                                    System.out.println("Enter the new CONTACT :  ");
                                                    long user_con = x.nextLong();
                                                    TestEngineer.testEngineers[i].setContact(user_con);
                                                    break;
                                                }

                                                case 3:
                                                {
                                                    dtk = false;
                                                    break;
                                                }

                                            }

                                        } while (dtk);


                                    }


                                }

                                break;

                            }

                            case 3:
                            {
                                case6=false;
                                break;
                            }


                        }


                    }while (case6);

                    break;
                }

                case 7:
                {
                    mbt=false;
                    System.out.println("Exiting Portal ");
                    System.out.print("*");
                    Thread.sleep(350);
                    System.out.print("*");
                    Thread.sleep(350);
                    System.out.print("*");
                    Thread.sleep(350);
                    break;

                }//main exiting switch


            } // main switch


        }while (mbt);



    }// main method ends







}//class ends
