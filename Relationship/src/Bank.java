class Bank
{
    private String bname,IFSC,Branch;
    private Account[] ac = new Account[3];



    Bank(String bname,String IFSC,String Branch)
    {
        this.bname=bname;
        this.IFSC=IFSC;
        this.Branch=Branch;

    }



    public static Bank Getbank(String bname,String IFSC,String Branch)
    {
          return new Bank(bname,IFSC,Branch);

    }

    public Account AddAccount(String acc_holder_name,long acc_number,long contact, double balance)
    {
        return new Account(acc_holder_name, acc_number, contact, balance);

    }




}