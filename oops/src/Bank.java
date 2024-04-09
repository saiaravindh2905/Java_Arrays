import javax.security.auth.login.AccountException;
import java.util.Scanner;
class Bank
{
    static Scanner x = new Scanner(System.in);
    private String Bank_name;
    private String IFSC_Code;
    private String branch;
    private Account [] accounts;
    private Bank()
    {

    }

    private Bank(String Bank_name,String IFSC_Code,String branch, Account [] accounts )
    {
        this.Bank_name=Bank_name;
        this.IFSC_Code=IFSC_Code;
        this.branch=branch;
        this.accounts=accounts;

    }
    public String getBank_name()
    {
        return Bank_name;
    }
    public String getIFSC_Code()
    {
        return IFSC_Code;
    }
    public String getBranch()
    {
        return branch;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;

    }

    public Account[] getAccounts() {
        return accounts;
    }



    public static Bank getBank(String bank_name ,String IFSC_Code, String branch,Account[]Accounts)
    {
        return new Bank(bank_name,IFSC_Code,branch,Accounts);
    }













}