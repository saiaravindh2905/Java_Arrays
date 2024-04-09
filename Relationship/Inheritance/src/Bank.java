class Bank
{
    // states
    private String bname , branch;
    private long ifsc;

    // constructor

    Bank()
    { // l.o.i

    }

    Bank(String bname,String branch, long ifsc)
    {
         this.bname=bname;
         this.branch=branch;
         this.ifsc=ifsc;
    }

    public String getBname() {
        return bname;
    }

    public String getBranch() {
        return branch;
    }

    public long getIfsc() {
        return ifsc;
    }


}

class SavingsAccount extends Bank
{
    String acc_holder_name;
    long age,contact;
    private long acc_number;
    private double balance = 0;


    SavingsAccount()
    {// l.o.i

    }

    SavingsAccount(String acc_holder_name,long age,long contact,long acc_number,String bname,String branch, long ifsc)
    {
        super(bname,branch,ifsc);
        this.acc_holder_name=acc_holder_name;
        this.age=age;
        this.contact=contact;
        this.acc_number=acc_number;

    }

    public void Deposit(double dep)
    {
        balance+=dep;
    }

    public void Withdraw(double wit)
    {
        balance-=wit;
    }

    public double getBalance() {
        return balance;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public void DetailsofSA()
    {
        System.out.println(" ********* Savings Account ***************\n\n");

        System.out.println("Account Holder name :"+acc_holder_name);
        System.out.println("Account Number      : "+acc_number);
        System.out.println("Bank name           : "+getBname());
        System.out.println("Bank IFSC code      : "+getIfsc());
        System.out.println("Branch name         : "+getBranch());
        System.out.println("Contact number      : "+contact);
        System.out.println("Age                 : "+age);
        System.out.println("Account Balance     : "+balance);
        System.out.println(" ****************************   \n\n");

    }


}

class CurrentAccount extends Bank
{


    String acc_holder_name;
    long age,contact;
    private long acc_number;
    private double balance = 0;


    CurrentAccount()
    {// l.o.i

    }

    CurrentAccount(String acc_holder_name,long age,long contact,long acc_number,String bname,String branch, long ifsc)
    {
        super(bname,branch,ifsc);
        this.acc_holder_name=acc_holder_name;
        this.age=age;
        this.contact=contact;
        this.acc_number=acc_number;

    }

    public void Deposit(double dep)
    {
        balance+=dep;
    }

    public void Withdraw(double wit)
    {
        balance-=wit;
    }

    public double getBalance() {
        return balance;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public void DetailsofCA()
    {
        System.out.println(" ********* Current Account ***************\n\n");

        System.out.println("Account Holder name :"+acc_holder_name);
        System.out.println("Account Number      : "+acc_number);
        System.out.println("Bank name           : "+getBname());
        System.out.println("Bank IFSC code      : "+getIfsc());
        System.out.println("Branch name         : "+getBranch());
        System.out.println("Contact number      : "+contact);
        System.out.println("Age                 : "+age);
        System.out.println("Account Balance     : "+balance);
        System.out.println(" ****************************   \n\n");

    }


}

