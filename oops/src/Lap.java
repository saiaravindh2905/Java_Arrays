class Lap
{

    private String lname;
    private double price;
    private String ram;


    public Lap(String lname,double price,String ram )
    {
        this.lname=lname;
        this.price=price;
        this.ram=ram;

    }

    public String getLname()
    {
        return lname;
    }
    public double getPrice()
    {
        return price;
    }
    public String getRam()
    {
        return ram;
    }

    public void lapdetails()
    {
        System.out.println("*************************");
        System.out.println("Laptop Name : "+lname);
        System.out.println("Laptop Price : "+price);
        System.out.println("laptop Ram : "+ram);
        System.out.println("*************************");


    }





}
