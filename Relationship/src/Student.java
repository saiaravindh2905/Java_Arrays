class Student
{
    private static Student s;
    private double marks = 34;
    private String name = "Dinga";

    private Student()
    {

    }

    public static Student getStudentobj()
    {
        if(s ==null)
        {
            s = new Student();
        }

        return s;

    }

 // Singleton design pattern ( A class for whom we create, only One object is called as Singleton design pattern.)

}
