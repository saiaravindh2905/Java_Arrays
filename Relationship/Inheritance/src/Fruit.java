class Fruit
{
    String taste;
    String origin;

    Fruit()
    {
      //  this(taste,origin);
    }
    Fruit(String taste,String origin)
    {
        this.taste=taste;
        this.origin=origin;

    }

    public void DetailsofFruit()
    {
        System.out.println("Taste : "+taste);
        System.out.println("Origin : "+origin);

    }


}

class Apple extends Fruit
{
    String Fname;
    String color;
    double price;

    Apple()
    {  //L.O.I

    }

    Apple(String Fname,String color,double price,String taste,String origin)
    {
        super(taste, origin);
        //L.O.I
        this.Fname=Fname;
        this.color=color;
        this.price=price;

    }

    public void DetailsofApple()
    {
        System.out.println("\n\n\t"+Fname+"\n");
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
        DetailsofFruit();

    }


}

class Banana extends Fruit
{
    String Fname;
    String color;
    double price;

    Banana()
    {  //L.O.I

    }

    Banana(String Fname,String color,double price,String taste,String origin)
    {
        super(taste, origin);
        //L.O.I
        this.Fname=Fname;
        this.color=color;
        this.price=price;

    }

    public void DetailsofBanana()
    {
        System.out.println("\n\n\t"+Fname+"\n");
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
        DetailsofFruit();

    }


}

class Mango extends Fruit
{
    String Fname;
    String color;
    double price;

    Mango()
    {  //L.O.I

    }

    Mango(String Fname,String color,double price,String taste,String origin)
    {
        super(taste, origin);
        //L.O.I
        this.Fname=Fname;
        this.color=color;
        this.price=price;

    }

    public void DetailsofMango()
    {
        System.out.println("\n\n\t"+Fname+"\n");
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
        DetailsofFruit();

    }


}