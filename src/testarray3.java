class testarray3
{
    static int res = 1;
    public static void main(String [] args)
    {
        int result = fact(1);


    }

    public static int fact(int num)
    {
        if(num>0)
        {
            res = num;
            System.out.println(res);
            num++;
            fact(num);
        }
        return num;


    }


}
