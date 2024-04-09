import java.util.*;
class Account
{
    private String acc_holder_name ;
    private long acc_no;
    private long contact;
    private double balance;
    static Scanner x = new Scanner(System.in);
    private Account()
    {//loi

    }
    private Account(String acc_holder_name,long acc_no,long contact,double balance)
    {
        this.acc_holder_name=acc_holder_name;
        this.acc_no=acc_no;
        this.contact=contact;
        this.balance=balance;

    }
    public String getAcc_holder_name()
    {
        return acc_holder_name;
    }
    public long getAcc_no()
    {
        return acc_no;
    }
    public double getBalance()
    {
        return balance;
    }
    public long getContact()
    {
        return contact;
    }

    public void setAcc_holder_name(String acc_holder_name)
    {
        if(Verification())
        {
            this.acc_holder_name=acc_holder_name;
            System.out.println("Name Updated");
        }
        else
            System.out.println("Verification failed");

    }

    public void setContact(long contact)
    {
        if(Verification())
        {
            this.contact=contact;
            System.out.println("Contact Updated");
        }
        else
            System.out.println("Verification failed");

    }

    public void Deposit(double balance)
    {
        if(Verification())
        {
            this.balance=balance;
        }
        else
            System.out.println("Verification Failed");

    }

    public void DetailsofAccount()
    {
        System.out.println("Account Holder Name : "+acc_holder_name);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account Balance : "+balance);
        System.out.println("Account Holder Contact Number : "+contact);

    }

    public static Account getAccount(String acc_holder_name,long acc_no,long contact,double balance)
    {
        return new Account(acc_holder_name, acc_no, contact, balance);
    }

    public boolean Verification()
    {
        System.out.println("Verify your account by Name (or) Contact ");
        System.out.println("1.Name  \n2.Contact");
        int vb = x.nextInt();

        switch (vb)
        {
            case 1 :
            {
                System.out.println("Enter your name to verify (Case sensitive) : ");
                String user_name = x.next();
                if (acc_holder_name.equals(user_name))
                {
                    System.out.println("Generating OTP");
                    int S_otp = (int) (Math.random() * 999 + 999);
                    System.out.println(S_otp);
                    System.out.println("Enter the OTP : ");
                    int user_otp = x.nextInt();

                    if (S_otp == user_otp)
                    {
                        return true;
                    }


                }

                break;
            }
            case 2 :
            {
                System.out.println("Enter your Contact number to verify : ");
                long user_contact = x.nextLong();

                if (contact == user_contact)
                {
                    System.out.println("Generating OTP");
                    int S_otp = (int) (Math.random() * 999 + 999);
                    System.out.println(S_otp);
                    System.out.println("Enter the OTP : ");
                    int user_otp = x.nextInt();

                    if (S_otp == user_otp)
                    {
                        return true;
                    }


                }

                break;
            }






        }

        return false;
    }





}