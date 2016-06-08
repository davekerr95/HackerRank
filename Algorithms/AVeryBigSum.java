import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum 
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        long userArray[] = new long [in.nextInt()];
        System.out.println(longArray(userArray));
    }

    public static long longArray(long array[])
    {
        long sum = 0;

       // Filling array with numbers and adding them;
        for(int i = 0; i < array.length; i++)
        {
            sum += in.nextLong();
        }
        return sum;
    }
}
