
import java.util.*;

public class BaseIndex {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int base, index, p = 1;
        System.out.println("enter a base");
        base = sc.nextInt();
        System.out.println("enter a index");
        index = sc.nextInt();
        int i = 1;
        for (i <= index ) {
            p = p * base;
            i++;
        }
        System.out.printf("power is %d\n", p);
    }
}
