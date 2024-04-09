class Child
{
    int a;

    Child()
    {
        a=10;
    }
    void hide()
    {
        System.out.println(a);
    }


}

class Parent extends Child
{
    int b;

    void demo()
    {
        System.out.println(b);
    }

    Parent()
    {
        super();
    }

    Parent(int b)
    {
        this();
        this.b=b;
    }


}

class PCdriver
{
    public static void main(String [] args)
    {
        Parent p = new Parent(30 );
        p.demo();

    }

}
