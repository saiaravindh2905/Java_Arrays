class Book
{
    // States
    private String author;
    private String bname;

    // Constructor

    Book()
    {// l.o.i

    }

    Book(String author,String bname)
    {
        this.author=author;
        this.bname=bname;
    }

    // getter
    public String getBname()
    {
        return bname;
    }

    public String getAuthor()
    {
        return author;
    }



}// class book ends

class Library
{
     private double price;
     private Book []book;

     Library()
     {

     }

     Library(double price,int l)
     {
         this.price=price;
         this.book= new Book[l];
     }


    public double getPrice() {
        return price;
    }

    public void addbook(String author,String bname)
    {

    }



}



class Lb
{

    public static void main(String[] args)
    {
      Library l1 = new Library(200,2);


    }


}
