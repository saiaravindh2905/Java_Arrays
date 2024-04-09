import java.awt.*;

class Qspiders1driver
{
    public static void main(String [] args)
    {
        Qspiders1 q1 = new Qspiders1("abc","chennai");
        Qspiders1 q2 = new Qspiders1("def","bangalore");
        Qspiders1 q3 = new Qspiders1("ghi","hydrebad");


        System.out.println("*****************************");

        System.out.println("manager 1 : "+q1.getmgr());
        System.out.println("Location 1 : "+q1.getLoc());
        System.out.println("*****************************");
        System.out.println("manager 2 : "+q2.getmgr());
        System.out.println("Location 2 : "+q2.getLoc());
        System.out.println("*****************************");
        System.out.println("manager 3 : "+q3.getmgr());
        System.out.println("Location 3 : "+q3.getLoc());
        System.out.println("*****************************");

        System.out.println(q1.name);




    }


}
