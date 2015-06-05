

/**
 * Created by Administrator on 2015/6/4.
 */
import java.util.*;

public class Tri {
    static int[] a = {0, 0, 0};
    static double s = 0;

    public static void scan () {
        Scanner input = new Scanner(System.in);
        a[0] = input.nextInt();
        a[1] = input.nextInt();
        a[2] = input.nextInt();
    }

    public static int check () {
        if ( a[0] + a[1] <= a[2] || a[0] + a[2] <= a[1]){
            System.out.println("ERROR!");
            return 1;
        }else{
            return 0;
        }
    }

    public static double count () {
        double i = 0;
        i = (a[0] + a[1] + a[2])/2;
        s = i* (i - a[0]) * (i - a[1]) * (i - a[2]);
        s = Math.sqrt(s);
        return s;
    }

    public static void main () {
        scan ();
        if ( check() == 0 ){
            count ();
        }
        System.out.println(s);
    }
}