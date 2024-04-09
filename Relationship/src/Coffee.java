import java.util.Date;

class Coffee
{
    // States
    String cname,type;
    double price;
    // Behaviour
    Coffee (){
        // LOI
    }

    Coffee (String  cname, String type, double price)
    {
        this.cname=cname;
        this.type=type;
        this.price=price;

    }

    public void DetailsodCoffee()
    {
        System.out.println("Name of coffee : "+cname);
        System.out.println("Type of coffee : "+type);
        System.out.println("Price of coffee : "+price);

    }



}