import java.util.*;
class testarray2
{
    static Scanner x = new Scanner(System.in);

    public static void main(String [] args)
    {
        int []nums = {3,2,4,5};
        int target = 9;

        int j ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            for (j = 0 ; j< nums.length ; j++ )
            {
                  if (i==j)
                  {
                      j++;
                  }
                else if ((nums[i]+nums[j]) == target)
                {
                    System.out.println(i + "," + j);
                }
            }
        }


    }



}