import java.util.Scanner;
class Aadhar
{
    static Scanner x = new Scanner(System.in);
    private String name;
    private long contact;
    private int age;
    private String location;
    private long aadhar_no;

    public Aadhar()
    {//Loi

    }

    public Aadhar(String name,long contact,int age,String location,long aadhar_no)
    {
        this.name=name;
        this.contact=contact;
        this.age=age;
        this.location=location;
        this.aadhar_no=aadhar_no;

    }
    // Getter
    public String getName()
    {
        return name;
    }
    public long getContact()
    {
        return contact;
    }
    public int getAge()
    {
        return age;
    }
    public String getLocation()
    {
        return location;
    }
    public long getAadhar_no()
    {
        return aadhar_no;
    }
    // Setter
    public void setName(String name)
    {
        if(verification())
        {
            this.name=name;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }

    }
    public void setContact(long contact)
    {
        if(verification())
        {
            this.contact=contact;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }

    }
    public void setAge(int age)
    {
        if(verification())
        {
            this.age=age;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }

    }
    public void setLocation(String location)
    {
        if(verification())
        {
            this.location=location;
            System.out.println("Successfully Updated..\n");
        }
        else
        {
            System.out.println("Verification Failed..\n");
        }

    }

    //details
    public void DetailsAadhar()
    {
        System.out.println("\n ");
        System.out.println("Aadhar Number : "+aadhar_no);
        System.out.println("Aadhar Holder Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Location : "+location);
        System.out.println("Contact Number : "+contact);
        System.out.println("************************\n");



    }

    public boolean verification()
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