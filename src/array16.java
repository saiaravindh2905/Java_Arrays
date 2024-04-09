class array16   // MISSING NUMBERS
{
    public static void main(String [] args)
    {
        int []a ={ 3,6,10,12,14};

        for (int i =0,n=1; i<a.length; i++,n++)
        {
          if(a[i]!=n)
          {
              System.out.print(n+",");
              i--;
          }

        }



    }
}
