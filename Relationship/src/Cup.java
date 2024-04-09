class Cup
{
    String material,color;
    double price;
    Coffee cf;

    Cup()
    {

    }
    Cup(String material,String color,double price)
    {
        this.color=color;
        this.material=material;
        this.price=price;

    }

    public void AddCoffee(String cname,String type,double price)
    {
          if(cf==null) {
              cf = new Coffee(cname, type, price);
              System.out.println("Coffee added");
          }
          else
              System.out.println("Cup is not Empty");

    }

    public void RemoveCoffee()
    {
        cf = null; this.cf = cf;
        System.out.println("Coffee Removed");
    }

    public String iscupempty()
    {
        if(cf==null)
        {
           String res1 = "Cup is empty";
            return res1;
        }
        else {
            String res = "Cup is NOT empty";
            return res;
        }

    }

    public void DetailsOFCup()
    {
        System.out.println("Cup material :"+material);
        System.out.println("Cup color : "+color);
        System.out.println("Cup Price : "+price);

    }








}
