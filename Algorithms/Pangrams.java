import java.util.*;
import java.io.*;

public class Pangrams {

	static Scanner in = new Scanner(System.in);

	public static void main (String args []){

		String user = in.nextLine();
		boolean isPangram = true;
		for (char a = 'A'; a <= 'Z'; a++){
			if((user.indexOf(a) < 0) && (user.indexOf( (char)(a+32) ) < 0)){
				isPangram = false;

			}
		}

		if(isPangram){
			System.out.println("pangram");
		}
		else if (!isPangram){
			System.out.println("not pangram");
		}
	}

}
