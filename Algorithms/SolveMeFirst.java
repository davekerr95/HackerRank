import java.io.*;
import java.util.*;

public class SolveMeFirst
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        addNumbers(a,b);
    }

    public static void addNumbers(int a, int b)
    {
        System.out.println(a+b);
    }
}
