class A
{
  /*  static int a = 10;
    int c = 50;



    static{
        System.out.println("I am A MLSI");
    }

    public static void run()
    {
        System.out.println("Running");
    }

    public static void main()
    {
        System.out.println("I am Class A main method");


    } */




    A()
    {
        this(1);
        System.out.println("Hi");
    }

    A(int a)
    {   this('s');
        System.out.println("I am");
    }

    A(char b)
    {
        System.out.println("Surya");

    }


    public static void main(String [] args)
    {
        A a = new A();


    }

}


