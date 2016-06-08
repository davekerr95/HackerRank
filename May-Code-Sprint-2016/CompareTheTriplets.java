import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aliceArray [] = new int [3], bobArray [] = new int [3];
        int alice = 0, bob = 0;

        for(int i = 0; i < 3; i++)
            aliceArray[i] = in.nextInt();

        for(int i = 0; i < 3; i++)
            bobArray[i] = in.nextInt();

        for(int i = 0; i < 3; i++){

            if(aliceArray[i] < bobArray[i])
                bob++;

            else if(aliceArray[i] > bobArray[i])
                alice++;
        }


        System.out.println(alice + " " + bob);



    }
}
