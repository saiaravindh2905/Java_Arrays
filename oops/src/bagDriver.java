class bagDriver
{
    public static void main(String [] args)
    {
        bag b1 = new bag("Skybags",1950,"Red");
        bag b2 = new bag("Aristocat",3185.50,"Black");

        System.out.println(" \n");
        b1.BagDetails();
        b2.BagDetails();
        System.out.println(" \n");

        System.out.println("B1 name : "+b1.getBname());
        System.out.println("B1 Price : "+b1.getPrice()); // for calling private variable
        System.out.println("B1 Color : "+b1.color); // for calling public or default variable in other class
        System.out.println(" \n");
        System.out.println("****************************");
        System.out.println("B2 name : "+b2.getBname());
        System.out.println("B2 Price : "+b2.getPrice());
        System.out.println("B2 Color : "+b2.color);

        System.out.println(" \n");

        b1.setBname("HpBags");// for private
        b1.color="orange";// for public or default
        System.out.println("B1 name : "+b1.getBname());

        b1.BagDetails();










    }

}
