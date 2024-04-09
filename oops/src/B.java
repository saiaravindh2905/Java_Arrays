class B extends A
{
    static int y = 20;

    public static void main(String [] args)
    {
        System.out.println(y);
        System.out.println(A.x);
        System.out.println(B.x);
        System.out.println(x);

    }


}
