import java.util.*;
class Application
{
    static Scanner x = new Scanner(System.in);
    static int a,b,c,num,s,count,last,sum=0,temp,fact=1,power=1,product=1,mean=0,max=0,min=0;
    static  long n1,n2,n3;
    static String retry,result;
    static  boolean loop = true,loop2 = true;

    public static void main(String [] args)throws Exception
    {
         do
         {
                System.out.println("\n\n\t\t\t\t\t\t\t\t***** PART 1 ***** ");
                System.out.println("\n Select your choice ");
                System.out.println("\n1. Find the Prime Number \n2. Find the Strong Number \n3. Find the Armstrong Number \n4. Find the Digital Sum \n5. Find the Digital Product" +
                        " \n6. Xylem & Phoelum \n7. Print the given number in Reverse \n8. Factorial of given Number \n9. Factor of given Number \n10. Find the Minimum Digit" +
                        " \n11. Find the Maximum Digit \n12. Print the Multiplication tables of given number \n13. Perfect Number \n14. Power Operation \n15. Palindrome" +
                        " \n16. Binary to Decimal \n17. Decimal to Binary \n18. Fibonacci Series \n0. Exit ");


                System.out.println("Select : ");
                s = x.nextInt();

               if (s>=0 && s<19){

                switch (s)
                {
                    case 1 :{// Prime Numbers
                        Prime();
                        break;}
                    case 2 :{// Strong Number
                        strong();
                        break;}
                    case 3 :{// Armstrong Number
                        Armstrong();
                         break;}
                    case 4 :{// Digital Sum
                        DigitalSum();
                        break;}
                    case 5 :{// Digital Product
                        DigitalProduct();
                        break;}
                    case 6 :{// Xylem & Phoelem
                        Xylem();
                        break;}
                    case 7 :{// Print reverse
                        Print_reverse();
                        break;}
                    case 8 :{// Factorial
                        factorial();
                        break;}
                    case 9 :{// Factor
                        factor();
                        break;}
                    case 10 :{// Minimum Digit
                        Minimumdigit();
                        break;}
                    case 11 :{// Maximum Digit
                        Maximumdigit();
                        break;}
                    case 12 :{// Multiplication Table
                        MultiplicationTable();
                        break;}
                    case 13 :{// Perfect Number
                        Perfectnumber();
                        break;}
                    case 14 :{// Power Operation
                        PowerOperation();
                        break;}
                    case 15 :{// Palindrome
                        Palindrome();
                        break;}
                    case 16 :{// Binary to Decimal
                        BinarytoDecimal();
                        break;}
                    case 17 :{// Decimal to Binary
                        DecimaltoBinary();
                        break;}
                    case 18 :{// Fibonacci
                        Fibonacci();
                        break;}
                    case 0 :{ // Exit
                        loop = false;
                        break;}

                }

            } else
            {
                   System.out.println("Enter the valid selection number given in the list above...\n U Stupid...  ");
            }
         }while (loop);
    }
    public static void Prime ()throws Exception
    {

        do {

            System.out.println("\n\n\t\t\t * PRIME NUMBER * ");
            System.out.println("\n Enter the Number : ");
            num = x.nextInt();
            if (num >= 2) {

                for (int i = 1; i <=num; i++) {
                    if (num % i == 0) {
                        count++;
                    }

                }
                if (count == 2) {
                    System.out.println("The given number " + num + " is a Prime Number");
                } else {
                    System.out.println("The given number " + num + " is a Composite number ");
                }

                count = 0;num=0;
                Thread.sleep(1250);

                System.out.println("\nRetry prime number (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting Prime Numbers........");
                    Thread.sleep(1500);
                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry prime number (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                  loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting Prime Numbers........");
                    Thread.sleep(1500);
                }


            }


        }while (loop);
        loop = true;

    }

    public static void strong()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t * STRONG NUMBER * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            if (num >= 1) {

                while(num>0)
                {
                    last = num%10;

                    for(int i = 1 ; i<=last ; i++)
                    {
                        fact = fact * i;

                    }
                    sum += fact;
                    fact = 1;

                    num/=10;

                }

                if (temp == sum)
                {
                    System.out.println("The given number "+temp+" is a Strong Number");
                }
                else
                {
                    System.out.println("The given number "+temp+" is NOT a Strong Number");
                }

                temp=0;sum = 0;fact = 1;last = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry Strong number (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting Strong Numbers........");
                    Thread.sleep(1500);
                }




            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry Strong number (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting Strong Numbers........");
                    Thread.sleep(1500);
                }


            }


        }while (loop);
        loop = true;

    }

    public static void Armstrong()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t * ARMSTRONG NUMBER * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;

            if (num >= 1) {

                while (num>0)
                {
                    count++;
                    num/=10;
                }

               num = temp;

                while(num>0)
                {
                    last = num%10;

                    for(int i = 1 ; i<=count ; i++)
                    {
                        product = product * last;

                    }
                    sum += product;
                    product = 1;

                    num/=10;

                }

                if (temp == sum)
                {
                    System.out.println("The given number "+temp+" is a ArmStrong Number");
                }
                else
                {
                    System.out.println("The given number "+temp+" is NOT a ArmStrong Number");
                }

                temp=0;sum = 0;product = 1;last = 0;count=0;
                Thread.sleep(2000);
                System.out.println("\nRetry ArmStrong number (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting ArmStrong Numbers........");
                    Thread.sleep(1500);
                }


            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry ArmStrong number (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting ArmStrong Numbers........");
                    Thread.sleep(1500);
                }


            }


        }while (loop);
        loop = true;

    }

    public static void DigitalSum()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t * DIGITAL SUM * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            if (num >= 1) {

                while(num>0)
                {
                    last = num%10;
                    sum = sum+last;
                    num/=10;

                }

                System.out.println("THE DIGITAL SUM OF "+temp+" is "+sum);
                temp= 0;sum = 0;num = 0;last = 0;
                Thread.sleep(2000);
                System.out.println("\nRetry DIGITAL SUM (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting DIGITAL SUM........");
                    Thread.sleep(1500);
                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry DIGITAL SUM (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting DIGITAL SUM........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void DigitalProduct()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t * DIGITAL PRODUCT * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            if (num >= 1) {

                while(num>0)
                {
                    last = num%10;
                    product = product * last;
                    num/=10;

                }

                System.out.println("THE DIGITAL PRODUCT OF "+temp+" is "+product);
                temp= 0;product = 1;num = 0;last = 0;
                Thread.sleep(2000);
                System.out.println("\nRetry DIGITAL PRODUCT (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting DIGITAL PRODUCT........");
                    Thread.sleep(1500);
                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry DIGITAL PRODUCT (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting DIGITAL PRODUCT........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void Xylem()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t * XYLEM & PHOELEM * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;

            if (num >= 1) {

              last = num%10;

              while(num>9)
              {
                  mean+= num%10;
                  num/=10;

              }
              mean = mean -last;

                System.out.println("SUM OF FIRST AND LAST DIGIT : "+(num+last));
                System.out.println("SUM OF MEAN DIGITS : "+mean);

                if((num+last)==mean)
                {
                    System.out.println("The given number "+temp+" is Xylem ");
                }
                else {
                    System.out.println("The given number "+temp+" is Phoelem ");

                }


                temp= 0;product = 1;num = 0;last = 0;mean=0;
                Thread.sleep(2000);
                System.out.println("\nRetry XYLEM & PHOELEM (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting XYLEM & PHOELEM........");
                    Thread.sleep(1500);
                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry XYLEM & PHOELEM (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting XYLEM & PHOELEM........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void Print_reverse()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t * REVERSE * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            b=0;

            if (num >= 1) {

                while(num>0)
                {
                    last = num%10;
                    b = (b*10)+last;
                    num/=10;

                }

                System.out.println("The Reverse of given numbers are : "+b);
                temp= 0;b = 0;num = 0;last = 0;
                Thread.sleep(2000);
                System.out.println("\nRetry REVERSE (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting REVERSE........");
                    Thread.sleep(1500);
                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry REVERSE (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting REVERSE........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }


    public static void factorial()throws Exception
    {
        do {

            System.out.println("\n\n\t\t\t *  FIND THE FACTORIAL  * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;fact = 1;

            if (num >= 1) {

                for(int i = 1 ; i<=num ; i++)
                {
                    fact = fact * i;

                }

                System.out.println("The Factorial of given number "+temp+" is  : "+fact);
                temp= 0;num = 0;fact=1;
                Thread.sleep(2000);
                System.out.println("\nRetry FACTORIAL (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting FACTORIAL........");
                    Thread.sleep(1500);
                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry FACTORIAL (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting FACTORIAL........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void factor()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t *  FIND THE FACTOR  * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;

            if (num >= 1)
            {
                for(int i = 1 ; i<=num ; i++)
                {
                   if(num%i==0)
                   {
                       System.out.println(num+" is Divisible by "+i);
                   }

                }

                temp= 0; num = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry FACTOR (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting FACTOR......");
                    Thread.sleep(1500);

                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry FACTOR (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting FACTOR........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void Minimumdigit()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t *  FIND THE MINIMUM DIGIT  * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            min=num%10;

            if (num >= 1)
            {
                for(int i = num ; i>0 ; i/=10)
                {
                    if(i%10 < min)
                    {
                        min = i%10;
                    }

                }

                System.out.println("The Minimum Digit Of given number "+temp+" is : "+min);


                temp= 0; num = 0; min =0;
                Thread.sleep(2000);

                System.out.println("\nRetry MINIMUM DIGIT (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting MINIMUM DIGIT......");
                    Thread.sleep(1500);

                }

            }
            else {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry MINIMUM DIGIT (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting MINIMUM DIGIT........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void Maximumdigit()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t *  FIND THE MAXIMUM DIGIT  * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            max=num%10;

            if (num >= 1)
            {
                for(int i = num ; i>0 ; i/=10)
                {
                    if(i%10 > max)
                    {
                        max = i%10;
                    }

                }

                System.out.println("The Maximum Digit Of given number "+temp+" is : "+max);


                temp= 0; num = 0; max = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry MAXIMUM DIGIT (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting MAXIMUM DIGIT......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry MAXIMUM DIGIT (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting MAXIMUM DIGIT........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void MultiplicationTable()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * PRINT THE MULTIPLICATION TABLE * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            System.out.println("Enter the Limit : ");
            a = x.nextInt();

            if (num >= 1)
            {
                for(int i = 1 ; i<=a ; i++)
                {
                    System.out.println(num+" x "+i+" = "+(num*i));
                }

                num = 0; a=0;
                Thread.sleep(2000);

                System.out.println("\nRetry MULTIPLICATION TABLE (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting MULTIPLICATION TABLE......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread. sleep(1500);
                System.out.println("\nRetry MULTIPLICATION TABLE (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting MULTIPLICATION TABLE........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void Perfectnumber()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * PERFECT NUMBER * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;

            if (num >= 1)
            {
                for(int i = 1 ; i<num ; i++)
                {
                    if(num%i==0)
                    {
                        sum+=i;
                    }

                }
                System.out.println("Sum  : "+sum);
                result = (sum==temp) ? temp+" is a Perfect Number": temp+" is NOT a Perfect NUmber";
                System.out.println(result);

                num = 0; temp = 0; sum = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry PERFECT NUMBER (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting PERFECT NUMBER......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry PERFECT NUMBER (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting PERFECT NUMBER........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void PowerOperation()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * POWER OPERATION * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            System.out.println("Enter the Power : ");
            power = x.nextInt();
            temp = num;


            if (num >= 1)
            {
                for(int i = 1 ; i<=power ; i++)
                {
                    product*=num;

                }

                System.out.println("The Result of Power Operation is : "+product);

                num = 0; temp = 0; product = 1;
                Thread.sleep(2000);

                System.out.println("\nRetry POWER OPERATION (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting POWER OPERATION......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry POWER OPERATION (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting POWER OPERATION........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void Palindrome()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * PALINDROME  * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            System.out.println(temp);
            b=0;


            if (num >= 1)
            {
                while(num>0)
                {
                    last=num%10;
                    b = (b*10) + last;
                    num/=10;
                }


                System.out.println("Reversed : "+b);

                result = (b==temp)? "The given number "+temp+" is a Palindrome " : "The given number "+temp+" is NOT a Palindrome";
                System.out.println(result);

                num = 0; temp = 0; b=0; last = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry PALINDROME (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting PALINDROME......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry PALINDROME (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting PALINDROME........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void BinarytoDecimal()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * BINARY TO DECIMAL CONVERSION * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            power = 1;

            if (num >= 1)
            {
                while(num>0)
                {
                    sum = sum + num%10 * power;
                    power = power * 2;
                    num/=10;

                }


                System.out.println("Binary to Decimal Conversion of given number "+temp+" is "+sum);
                num = 0; temp = 0; power=1; sum = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry BINARY TO DECIMAL CONVERSION (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting BINARY TO DECIMAL CONVERSION......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry BINARY TO DECIMAL CONVERSION (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting BINARY TO DECIMAL CONVERSION........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }

    public static void DecimaltoBinary()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * DECIMAL TO BINARY CONVERSION * ");
            System.out.println("\nEnter the Number : ");
            num = x.nextInt();
            temp = num;
            power = 1;

            if (num >= 1)
            {
                while(num>0)
                {
                    sum = sum + num%2 * power;
                    num/=2;
                    power = power * 10;


                }


                System.out.println("Decimal to Binary Conversion of given number "+temp+" is "+sum);
                num = 0; temp = 0; power=1; sum = 0;
                Thread.sleep(2000);

                System.out.println("\nRetry DECIMAL TO BINARY CONVERSION (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting DECIMAL TO BINARY CONVERSION......");
                    Thread.sleep(1500);

                }

            }
            else
            {

                System.out.println("\nEnter the valid number!! ");
                Thread.sleep(1500);
                System.out.println("\nRetry DECIMAL TO BINARY CONVERSION (Y / N)");
                retry = x.next();
                Thread.sleep(1000);

                if (retry.equals("Y") || retry.equals("y"))
                {
                    loop = true;
                }
                else if (retry.equals("N") || retry.equals("n"))
                {
                    loop = false;
                    System.out.println("\nExiting DECIMAL TO BINARY CONVERSION........");
                    Thread.sleep(1500);
                }

            }

        }while (loop);
        loop = true;

    }


    public static void Fibonacci()throws Exception
    {
        do{

            System.out.println("\n\n\t\t\t * FIBONACCI SERIES * ");
            System.out.println("\nEnter the Limit : ");
            num = x.nextInt();
            temp = num; n1 =0; n2 =1;

            if (num >= 1)
            {
                System.out.print(n1+" "+n2+" ");
                num= num-3;

                 for(int i = 0 ; i<=num ; i++)
                {
                    n3 = n1+n2;
                    System.out.print(n3+" ");
                    n1 = n2;
                    n2 = n3;


                }

                num = 0; temp = 0; n1=0;n2=1;n3=0; sum = 0;
                Thread.sleep(2000);

                do {


                    System.out.println("\nRetry FIBONACCI SERIES (Y / N)");
                    retry = x.next();
                    Thread.sleep(1000);

                    if (retry.equals("Y") || retry.equals("y")) {
                        loop = true;
                        loop2 = false;
                    } else if (retry.equals("N") || retry.equals("n")) {
                        loop = false;
                        loop2 = false;
                        System.out.println("\nExiting FIBONACCI SERIES......");
                        Thread.sleep(1500);
                    }
                    else {
                        loop2 = true;
                    }
                }while (loop2);

            }
            else
            {
                do
              {   System.out.println("\nEnter the valid number!! ");
                  Thread.sleep(1500);
                  System.out.println("\nRetry FIBONACCI SERIES (Y / N)");
                  retry = x.next();
                  Thread.sleep(1000);

                  if (retry.equals("Y") || retry.equals("y")) {
                      loop = true;
                      loop2 = false;
                  } else if (retry.equals("N") || retry.equals("n")) {
                      loop = false;
                      loop2 = false;
                      System.out.println("\nExiting FIBONACCI SERIES........");
                      Thread.sleep(1500);
                  }
                  else {
                      loop2 = true;

                  }

              }while (loop2);

            }

        }while (loop);
        loop = true;

    }


}

