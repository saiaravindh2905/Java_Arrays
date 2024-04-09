class bag
{
    private String name;
    private double price;

    public String color;

    private bag()
    {//LOI

    }

    public bag(String name,double price,String color)
    {
        this.name=name;
        this.price=price;
        this.color=color;
    }

    public String getBname()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setBname(String name)
    {
        this.name=name;
    }
    public void setprice(double price)
    {
        this.price=price;
    }

    public void BagDetails()
    {
        System.out.println("*******************");
        System.out.println("Bag name : "+name);
        System.out.println("Bag price : "+price);
        System.out.println("bag color : "+color);
        System.out.println("*******************");

    }



}
