
// composition
class Engine
{

      public void work()
      {
          System.out.println("Engine is started");

      }




}

class Car
{
   private Engine engine;
     Car()
     {//l.o.i
       this.engine = new Engine();
     }

     public void move()
     {
         engine.work();
         System.out.println("Car is Moving");

     }


}

class Compositionex1
{
    public static void main(String[] args) {

        Car c = new Car();

        c.move();

    }



}