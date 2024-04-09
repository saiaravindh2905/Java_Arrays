import java.util.Scanner;

class BankAccountManager
{
      static Scanner x = new Scanner(System.in);

       public static void main(String [] args )
       {
           Account a1 = Account.getAccount("Sai",11015468,8124898802L,6500);


           System.out.println(a1.getBalance());
           System.out.println(a1.getAcc_holder_name());
           a1.DetailsofAccount();










       }




}
