class ATMcard
{
    private int pin;
    private String Bname;

    private ATMcard()
    {//loi

    }

    public ATMcard(int pin,String Bname)
    {
        this.pin=pin;
        this.Bname=Bname;

    }

    public int getpin()
    {
        return pin;
    }
    public  String getBname()
    {
        return Bname;
    }
    public void setpin(int pin)
    {
        this.pin=pin;
    }
    public void setBname(String Bname)
    {
        this.Bname=Bname;
    }

    public void DetailsofAtmCard()
    {
        System.out.println("************************");
        System.out.println("AtmCard Pin no : "+pin);
        System.out.println("AtmCard Bank name : "+Bname);
        System.out.println("************************");

    }




}
