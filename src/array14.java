class array14
{
    public static void main(String [] args)
    {
        int[]a = { 52,95,75,17,71 };
        int i=0;
        int min= a[i];

        for(i = 0 ; i<a.length ; i++)
        {
            if(a[i]<min)
            {
                min=a[i];

            }

        }

        System.out.println(min);

    }
}
