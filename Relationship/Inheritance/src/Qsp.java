class Qsp
{
    int eid;
    String company = "Qspiders";


    Qsp()
    {

    }

    Qsp(int eid)
    {
        this.eid=eid;

    }

    public void DetailsofEmp()
    {
        System.out.println("Employee ID : "+eid);
        System.out.println("Employee Company : "+company);
    }

}


class Faculty extends Qsp
{
    int age;
    String subject;

    Faculty()
    {

    }

    Faculty(int age,String subject,int eid)
    {
        super(eid);
        this.age=age;
        this.subject=subject;

    }

    public void DetailsofFaculty()
    {
        DetailsofEmp();
        System.out.println("Faculty Age : "+age);
        System.out.println("Faculty Subject : "+subject);

    }


}

class Councellor extends Qsp
{
    String designation = "Councellor";
    long contact;


    Councellor()
    {

    }

    Councellor(long contact)
    {
        this.contact=contact;
    }

    public void DetailsofCouncellor()
    {
        System.out.println("Designation : "+designation);
        System.out.println("Contact : "+contact);

    }

}
