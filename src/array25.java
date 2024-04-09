import java.util.*;
class array25
{
    //4x3
    public static void main(String []args)
    {

        int [][]a = { {1,2,3},{10,20,30},{40,50,60},{70,80,90} };
        int result [][] = new int[4][3];

        for (int i =a.length-1 ,m=0 ; i>=0  ; i--,m++)
        {
            if(i%2!=0)
            {
                for(int j = a[i].length-1,n=0 ; j>=0 ; j--,n++)
                { result[m][n]=a[i][j];
                }
            }
            else if (i%2==0)
            { for(int j = 0,n=0 ; j<a[i].length ; j++,n++)
                { result[m][n]=a[i][j];
                }
            }
        }

        for(int i = 0 ; i<result.length; i++)//
        {System.out.println(Arrays.toString(result[i]));
        }
    }
}
