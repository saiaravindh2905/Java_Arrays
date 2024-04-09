import java.lang.reflect.AnnotatedArrayType;

class DogUI
{
    public static void main(String [] args)
    {
        Dog d = new Dog(); // Creating object to access everything inside class.


        d.run();  // accessing non-static void method --
        // by creating object and call the method with the help of object.

        d.getstop(); // accessing non-static private void method --
        // by creating helper method ( public non-static void method )
        //  and call them with the help of helper method...
        // if the helper method is non-static ( call with the help of object)
        // if the helper method is static ( call with the help of class name )



        d.dead();
        Dog.dead();


        Dog.getrevive1(); // accessing private static void method --
        // by creating public static method (helper method) we can call with the help of class name,
        // as well as with the help of object also we can call.


        d.getrevive1(); // accessing private static void method --
        // by creating public static method (helper method) we can call with the help of class name,
        // as well as with the help of object also we can call.

        System.out.println("****************************************************");
        Animal a = new Animal();

        a.run();
        a.stop();


        /*

        public static int a = 10;
        private static int b = 20;
        public int c = 30;
        private int d = 40;

        */

        // static variables (public / private)

        // public static variable
        System.out.println(a.a);       // access by object
        System.out.println(Animal.a);  // access by class name

        // private static variable
        System.out.println(a.getb());      // access by object
        System.out.println(Animal.getb()); // access by class name


        // non static variables (public / private)

        // public non-static variable
        System.out.println(a.c);    // access only by object
        // [ we cannot access non-static variable using class name ]


        // private non-static variable
        System.out.println(a.getd()); // access only by object - with the help of helper method


    }

}