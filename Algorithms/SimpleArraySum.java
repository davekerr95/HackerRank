import java.io.*;
import java.util.*;

public class SimpleArraySum
{
    // Global Variables & Fields
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int userArray [] = new int [in.nextInt()];
        for(int i = 0; i < userArray.length; i++)
        {
            userArray[i] = in.nextInt();
        }

        System.out.println(addArray(userArray));
    }

    public static int addArray(int array [])
    {
        int sum = 0;

        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        return sum;
    }
}
