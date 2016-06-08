import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int userArray [] = new int [in.nextInt()];
        double countp = 0, countn = 0, count0 = 0;

        for(int i = 0; i < userArray.length; i++){
            userArray[i] = in.nextInt();
            if(userArray[i] < 0){
                countn++;
            }
            else if(userArray[i] > 0){
                countp++;
            }
            else if(userArray[i] == 0){
                count0++;
            }
        }

        System.out.println(countp / userArray.length);
        System.out.println(countn / userArray.length);
        System.out.println(count0 / userArray.length);


    }
}
