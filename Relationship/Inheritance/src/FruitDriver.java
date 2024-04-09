class FruitDriver
{
    public static void main(String [] args)
    {
        Apple a = new Apple("Apple","Red",120,"Sweet","Coimbatore");
        Banana b = new Banana("Banana","Yellow",60,"Sweet","Chennai");
        Mango m = new Mango("Mango","yellow",250,"Sweet and Sour","Salem");
        a.DetailsofApple();
        b.DetailsofBanana();
        m.DetailsofMango();
        String res = m.origin;

        System.out.println(res);


    }

}
