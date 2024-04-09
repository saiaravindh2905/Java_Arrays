import java.util.Scanner;
class AadharDriver
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)throws Exception
    {
         Aadhar a1 = new Aadhar("Sai",8124898802L,23,"Salem",864519948664L);
         Aadhar a2 = new Aadhar("Surya",7401175597L,21,"Chennai",757541416585L);
         Aadhar a3 = new Aadhar("Venkat",9360633106L,22,"Chennai",789858547856L);
         Aadhar a4 = new Aadhar("Jagadeesh",8681929041L,26,"Avadi",989658547857L);
         Aadhar a5 = new Aadhar("lenin",9150643834L,23,"Kallakurichi",985874125652L);

         Aadhar [] aadhars = {a1,a2,a3,a4,a5};



         boolean mainL = true;
         do
         {
             System.out.println("\t\t\t\n\n\t\t ** Welcome to Aadhar Portal ** \n");
             Thread.sleep(450);
             System.out.println("\t** Select your choice **");
             System.out.println("1.Get Details \n2.Change Details \n3.Exit");
             int mainb = x.nextInt();

             switch (mainb)
             {
                 case 1 :
                 {

                     boolean GD = true;
                   do {


                       System.out.println(" \t* Select Your Option to get Details * \n");
                       System.out.println("1.Full Details \n2.Single Detail \n3.Exit");
                       int bt1 = x.nextInt();

                       switch (bt1)
                       {
                           case 1 :
                           {

                             boolean FD = true;
                             do
                             {
                                     System.out.println("\t\t --  FULL DETAILS  -- \nSelect Any method : \n");
                                     System.out.println("1. Verify by Name \n2. Verify by Contact Number ");
                                     int v1 = x.nextInt();

                                   switch (v1)
                                   {
                                       case 1 : {
                                           System.out.println("Enter the Name of user (Case Sensitive) : ");
                                           String fdb1 = x.next();
                                           for (int i = 0; i < aadhars.length; i++)
                                           {
                                               if (aadhars[i].getName().equals(fdb1))
                                               {
                                                   aadhars[i].DetailsAadhar();
                                                   FD = false;
                                                   break;
                                               }//if ends


                                           }
                                           // for loop ends
                                         break;
                                       }
                                       case 2 :
                                       {
                                           System.out.println("Enter the Contact details of user : ");
                                           long fdb2 = x.nextLong();
                                           for (int i = 0; i < aadhars.length; i++)
                                           {
                                               if (aadhars[i].getContact() == fdb2)
                                               {
                                                   aadhars[i].DetailsAadhar();
                                                   FD = false;
                                                   break;
                                               }

                                           }
                                        break;
                                       }

                                   }

                             }while (FD);
                               Thread.sleep(2500);

                               break;
                           }


                           case 3 : {
                               System.out.println("Exiting from get details...");
                               Thread.sleep(1500);
                               GD=false;
                               break;
                           }

                           case 2 : {

                               boolean SD = true;
                               do
                               {
                                   System.out.println("\t\t --  SINGLE DETAIL  -- \nSelect Any method : \n");
                                   System.out.println("1. Verify by Name \n2. Verify by Contact Number ");
                                   int v1 = x.nextInt();

                                   switch (v1)
                                   {
                                       case 1 : {
                                           System.out.println("\nEnter the Name of user (Case Sensitive) : ");
                                           String fdb1 = x.next();
                                           for (int i = 0; i < aadhars.length; i++)
                                           {
                                               if (aadhars[i].getName().equals(fdb1))
                                               {
                                                   System.out.println("\nSelect the detail to View :-");
                                                   System.out.println("1.Name \n2.Contact number \n3.Age \n4.Location\n5.Aadhar Number");
                                                   int cb1= x.nextInt();

                                                   switch (cb1)
                                                   {
                                                       case 1 : {
                                                           System.out.println(aadhars[i].getName()+"\n");
                                                           break;
                                                       }
                                                       case 2 : {
                                                           System.out.println(aadhars[i].getContact()+"\n");
                                                           break;
                                                       }
                                                       case 3 : {
                                                           System.out.println(aadhars[i].getAge()+"\n");
                                                           break;
                                                       }
                                                       case 4 : {
                                                           System.out.println(aadhars[i].getLocation()+"\n");
                                                           break;
                                                       }
                                                       case 5 :{
                                                           System.out.println(aadhars[i].getAadhar_no()+"\n");
                                                           break;
                                                       }


                                                   }

                                                   SD = false;
                                                   break;
                                               }//if ends


                                           }
                                           // for loop ends
                                           break;
                                       }
                                       case 2 :
                                       {
                                           System.out.println("Enter the Contact details of user : ");
                                           long fdb2 = x.nextLong();
                                           for (int i = 0; i < aadhars.length; i++)
                                           {
                                               if (aadhars[i].getContact() == fdb2)
                                               {
                                                   System.out.println("\nSelect the detail to View :-");
                                                   System.out.println("1.Name \n2.Contact number \n3.Age \n4.Location\n5.Aadhar Number");
                                                   int cb1= x.nextInt();

                                                   switch (cb1)
                                                   {
                                                       case 1 : {
                                                           System.out.println(aadhars[i].getName()+"\n");
                                                           break;
                                                       }
                                                       case 2 : {
                                                           System.out.println(aadhars[i].getContact()+"\n");
                                                           break;
                                                       }
                                                       case 3 : {
                                                           System.out.println(aadhars[i].getAge()+"\n");
                                                           break;
                                                       }
                                                       case 4 : {
                                                           System.out.println(aadhars[i].getLocation()+"\n");
                                                           break;
                                                       }
                                                       case 5 :{
                                                           System.out.println(aadhars[i].getAadhar_no()+"\n");
                                                           break;
                                                       }


                                                   }


                                                   SD = false;
                                                   break;
                                               }

                                           }
                                           break;
                                       }

                                   }

                               }while (SD);
                               Thread.sleep(2500);

                               break;


                           }



                       }



                   }while (GD);


                     break;
                 }

                 case 2 : {

                    boolean CD = true;
                    do {

                        System.out.println("Change the Aadhar Details......");
                        Thread.sleep(500);
                        System.out.println("1. Verify by Name \n2. Verify by Contact Number \n3.Exit");
                        int v2 = x.nextInt();

                        switch(v2)
                        {
                            case 1 :
                            {
                                System.out.println("Enter the Name of user (Case Sensitive) : ");
                                String fdb1 = x.next();
                                for (int i = 0; i < aadhars.length; i++)
                                {
                                    if (aadhars[i].getName().equals(fdb1))
                                    {
                                        System.out.println("Select the detail to change :-");
                                        System.out.println("1.Name \n2.Contact number \n3.Age \n4.Location");
                                        int cb1= x.nextInt();

                                        switch (cb1)
                                        {
                                            case 1 : {
                                                System.out.println("Enter the New Name : ");
                                                aadhars[i].setName(x.next());
                                                break;
                                            }
                                            case 2 : {
                                                System.out.println("Enter the New Contact number : ");
                                                aadhars[i].setContact(x.nextLong());
                                                break;
                                            }
                                            case 3 : {
                                                System.out.println("Enter the New Age : ");
                                                aadhars[i].setAge(x.nextInt());
                                                break;
                                            }
                                            case 4 : {
                                                System.out.println("Enter the New Location : ");
                                                aadhars[i].setLocation(x.next());
                                                break;
                                            }

                                        }


                                        break;
                                    }//if ends


                                }
                                // for loop ends

                                break;

                            }
                            case 2 :
                            {
                                System.out.println("Enter the Contact details of user : ");
                                long fdb2 = x.nextLong();
                                for (int i = 0; i < aadhars.length; i++)
                                {
                                    if (aadhars[i].getContact() == fdb2)
                                    {
                                        System.out.println("Select the detail to change :-");
                                        System.out.println("1.Name \n2.Contact number \n3.Age \n4.Location");
                                        int cb1= x.nextInt();

                                        switch (cb1)
                                        {
                                            case 1 : {
                                                System.out.println("Enter the New Name : ");
                                                aadhars[i].setName(x.next());
                                                break;
                                            }
                                            case 2 : {
                                                System.out.println("Enter the New Contact number : ");
                                                aadhars[i].setContact(x.nextLong());
                                                break;
                                            }
                                            case 3 : {
                                                System.out.println("Enter the New Age : ");
                                                aadhars[i].setAge(x.nextInt());
                                                break;
                                            }
                                            case 4 : {
                                                System.out.println("Enter the New Location : ");
                                                aadhars[i].setLocation(x.next());
                                                break;
                                            }

                                        }


                                        break;
                                    }

                                }
                                break;

                            }

                            case 3 : {
                                CD=false;
                                System.out.println("\nExiting from Change Details.....");
                                Thread.sleep(2500);
                                break;
                            }

                        }

                    }while (CD);

                     break;
                 }
                 case 3 : {
                     mainL = false;
                     break;
                 }


             }

         }while(mainL);
        System.out.println("Closing AADHAR Portal *** ");
        Thread.sleep(1500);



    }
}