import java.util.*;

public class JavaStringReverse {

    public static void main(String agrs []){
        Scanner in = new Scanner(System.in); String x = in.nextLine(); in.close();
        System.out.println(x.equals(new StringBuffer(x).reverse().toString()) ? "Yes" : "No"); return;
    }

}
