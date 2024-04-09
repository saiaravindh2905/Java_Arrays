class Account
{
    private String acc_holder_name;
    private long acc_number,contact;
    private double balance;

    Account()
    {// LOI

    }

    Account(String acc_holder_name,long acc_number,long contact, double balance)
    {
        this.acc_holder_name=acc_holder_name;
        this.acc_number=acc_number;
        this.contact=contact;
        this.balance=balance;

    }

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public double getBalance() {
        return balance;
    }

    public long getContact()
    {
        return contact;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public boolean DetailsofAccount()
    {
        System.out.println("Account Holder name : "+acc_holder_name);
        System.out.println("Account Number : "+acc_number);
        System.out.println("COntact number : "+contact);
        System.out.println("Account Balance : "+balance);

            return true;

    }





}


