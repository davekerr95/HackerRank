import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference
{
    static Scanner in = new Scanner(System.in);
        
    public static void main(String[] args)
    {
        int n;
        n = in.nextInt();
        int userArray [][] = new int [n][n];
        System.out.println(matrixDiff(userArray));




    }

    public static int matrixDiff(int array [][])
    {
        int sum = 0, sum2 = 0, total = 0;

        // Loop for fill and adding first set of diagonals
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                array[i][j] = in.nextInt();

                if(i == j)
                {
                    sum += array[i][j];
                }
            }
        }

        // Loop for 2nd set of diagonals
        for(int i = array.length -1; i >= 0; i--)
        {
            sum2 += array[(array.length -1) - i][i];
        }

        total = Math.abs(sum - sum2);



        return total;
   }
}
