class method2
{
    public static void main(String [] args)
    {
            System.out.println("Hi from main");
            System.out.println("My name is : "+m1());
            System.out.println("King of IT is : ");
            m1(12);

                if(m1(true)==false)
                    System.out.println("Take it easy");

                    m1(5,2.0);

                    String str = m1();
                    System.out.println(str == "ABC");


            System.out.println("Bye from main");

    }
    static void m1(int a)
    {
        System.out.println("Java");
        return;
    }

    public static String m1()
    {
        System.out.println("Development");
        return "Java2SE";
    }
    public static void m1(int a,double b)
    {
        System.out.println(a+":"+b);
        return;
    }
    static boolean m1(boolean a)
    {
        if(a)
        {
            System.out.println("Java");
            return false;
        }
        else
        {
            System.out.println("SQL");
            return true;
        }

    }


}
