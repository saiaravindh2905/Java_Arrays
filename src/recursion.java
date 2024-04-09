class recursion
{
    public static void main(String[]args)
    {
        System.out.println("Hi from main");
        demo();
    }
    public static void demo()
    {
        System.out.println("Java");
        demo();
    }


}
