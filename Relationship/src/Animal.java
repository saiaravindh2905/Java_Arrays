class Animal
{
   public static int a = 10;
   private static int b = 20;

   public int c = 30;
   private int d = 40;


    public static int getb()
    {
        return b;
    }

    public int getd()
    {
        return d;
    }

    public static void dead()
    {
        System.out.println("Animal is dead");
    }

    private static void revive()
    {
        System.out.println("Animal revived");
    }

    public void getrevive()
    {
        revive();
    }

    void run()
    {
        System.out.println("Animal is Running");
    }

    void stop()
    {
        System.out.println("Animal Stops");
    }


}

class Dog extends Animal
{
    public static void dead()
    {
        System.out.println("Dog is dead");
    }

    private static void revive1()
    {
        System.out.println("Dog revived");
    }
    public static void getrevive1()
    {
        revive1();
    }
    void runD()
    {
        System.out.println("Dog is running");
    }
    private void stopD()
    {
        System.out.println("Dog Stops");
    }

    public void getstop()
    {
        stop();
    }



}

