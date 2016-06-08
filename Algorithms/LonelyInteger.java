import java.io.*;
import java.util.*;

public class LonelyInteger {

    protected static Scanner in = new Scanner(System.in);

    public static void main(String args []) {

        int inputs = in.nextInt();
        in.nextLine();
        int inputArray [] = new int[inputs];

        for(int i = 0; i < inputs; i++)
        	inputArray[i] = in.nextInt();

        for(int i = 0; i < inputArray.length; i++)
        	if(checkOccurences(inputArray[i], inputArray))
        		System.out.println(inputArray[i]);

    }



    private static boolean checkOccurences(int number, int array []){

    	int occurences = 0;

    	for(int i = 0; i < array.length; i++)
    		if(array[i] == number)
    			occurences++;

    	if(occurences == 1)
    		return true;

    	else
    		return false;

    }

}
