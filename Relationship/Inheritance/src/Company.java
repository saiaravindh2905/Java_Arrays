import java.util.Scanner;

class Company
{
   static Scanner x = new Scanner(System.in);
    String cname ;
    String ceo ;

    Company()
    {// l.o.i

    }

    Company(String cname,String ceo)
    {
       this.cname = cname;
       this.ceo=ceo;
    }

    public void DetailsOFCompany()
    {
        System.out.println("Company Name : "+cname);
        System.out.println("Company Ceo : "+ceo);

    }


}

class Developer extends Company
{
    private int eid;
    private long contact;
    private double sal;
    public static Developer [] developers;

    Developer()
    {// l.o.i

    }

    Developer(int eid,long contact,double sal,String cname,String ceo)
    {
        super(cname,ceo);
        this.eid=eid;
        this.contact=contact;
        this.sal=sal;

    }

    public int getEid()
    {
        return eid;
    }

    public void setEid(int eid)
    {
        if(Dverification())
        {
            this.eid = eid;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }


    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact)
    {
        if(Dverification())
        {
            this.contact = contact;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }

    }
    public double getSal()
    {
         return sal;
    }

    public static Developer getDeveloper(int eid,long contact,double sal,String cname,String ceo)
    {
        return new Developer(eid,contact,sal,cname,ceo);
    }

    public void DetailsOFDeveloper()
    {
        System.out.println("Employee ID : "+eid);
        System.out.println("Employee Contact : "+contact);
        System.out.println("Employee Salary : "+sal);
        DetailsOFCompany();

    }

    public static void CD()
    {
        System.out.println("Enter the number of new Employees in Developer :");
        developers = new Developer[ x.nextInt()];

        for( int i = 0 ; i< developers.length ; i++ ) {
            boolean fl = true;
            do {


                System.out.println("Enter the EID :");
                int eid = x.nextInt();

                System.out.println("Enter the contact :  ");
                long contact = x.nextLong();

                System.out.println("Enter the salary : ");
                double sal = x.nextDouble();

                System.out.println("Enter the Company name : ");
                String cname = x.next();

                System.out.println("Enter the CEO name : ");
                String ceo = x.next();

                Developer d = new Developer(eid, contact, sal, cname, ceo);
                developers[i] = d;

                System.out.println("************************\n\n");
                fl=false;


            } while (fl);

        }
    }


    public boolean Dverification()
    {
        System.out.println("Enter your Contact number to verify : ");
        long user_contact = x.nextLong();

        if(contact == user_contact)
        {
            System.out.println("Generating OTP");
            int S_otp = (int)(Math.random()*999+999);
            System.out.println(S_otp);
            System.out.println("Enter the OTP : ");
            int user_otp = x.nextInt();

            if(S_otp==user_otp)
            {
                return true;
            }


        }

        return false;

    }




}


class TestEngineer extends Company
{
    private int eid;
    private long contact;
    private double sal;

    public static  TestEngineer [] testEngineers;

    TestEngineer()
    {// l.o.i

    }

    TestEngineer(int eid,long contact,double sal,String cname,String ceo)
    {
        super(cname,ceo);
        this.eid=eid;
        this.contact=contact;
        this.sal=sal;

    }

    public int getEid()
    {
        return eid;
    }

    public void setEid(int eid)
    {
        if(TEverification())
        {
            this.eid = eid;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }

    }

    public long getContact() {
        return contact;
    }


    public void setContact(long contact)
    {
        if(TEverification())
        {
            this.contact = contact;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }


    }

    public double getSal()
    {
        return sal;
    }

    public static TestEngineer getTestEngineer(int eid,long contact,double sal,String cname,String ceo)
    {
        return new TestEngineer(eid,contact,sal,cname,ceo);
    }

    public void DetailsOFTestEngineer()
    {
        System.out.println("Employee ID : "+eid);
        System.out.println("Employee Contact : "+contact);
        System.out.println("Employee Salary : "+sal);
        DetailsOFCompany();

    }

    public static void CTE()
    {
        System.out.println("Enter the number of new Employees in Test Engineers :");
        testEngineers = new TestEngineer[ x.nextInt()];


        for( int i = 0 ; i< testEngineers.length ; i++ )
        {

                System.out.println("Enter the EID :");
                int eid = x.nextInt();

                System.out.println("Enter the contact :  ");
                long contact = x.nextLong();

                System.out.println("Enter the salary : ");
                double sal = x.nextDouble();

                System.out.println("Enter the Company name : ");
                String cname = x.next();

                System.out.println("Enter the CEO name : ");
                String ceo = x.next();

                TestEngineer t = new TestEngineer(eid, contact, sal, cname, ceo);
                testEngineers[i]=t;



        }




    }

    public boolean TEverification()
    {
        System.out.println("Enter your Contact number to verify : ");
        long user_contact = x.nextLong();

        if(contact == user_contact)
        {
            System.out.println("Generating OTP");
            int S_otp = (int)(Math.random()*999+999);
            System.out.println(S_otp);
            System.out.println("Enter the OTP : ");
            int user_otp = x.nextInt();

            if(S_otp==user_otp)
            {
                return true;
            }


        }

        return false;

    }

}