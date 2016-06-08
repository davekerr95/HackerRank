import java.io.*;
import java.util.*;

public class UtopianTree {
    	// Global Variables & Fields
	static Scanner in = new Scanner(System.in);

	// Main Method //
	public static void main(String[] args) {

		// Local Variables & Fields
		int cases = in.nextInt();
		int cycles [] = new int[cases];
		int height;

		// Loop for filling array

		for(int i = 0; i < cycles.length; i++){

			cycles[i] = in.nextInt();
		}

		// Loop for calculating height of each test case

		for(int i = 0; i < cases; i++){

			height = 1;

			for(int j = 1; j <= cycles[i]; j++){

				if(j % 2 == 1){
					height = (height * 2);
				}

				else{
					height++;
				}
			}
			System.out.println(height);
		}


	}

}
