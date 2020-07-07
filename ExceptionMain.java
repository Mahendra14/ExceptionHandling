/*
 * Sample Input 0

5 3
4 2
0 0
-6 -4
-3 3
Sample Output 0

243
16
java.lang.Exception: a and b should not be zero.
java.lang.Exception: a or b should not be negative.
java.lang.Exception: a or b should not be negative.
 */
import java.util.*;

public class ExceptionHandling {
        public static final MyCal my_calculator = new MyCal();
       
        
        public static void main(String[] args) {
 public static final Scanner in = new Scanner(System.in);
            while (in .hasNextInt()) {
                int a = in .nextInt();
                int b = in .nextInt();
                
                try {
                    System.out.println(my_calculator.power(a, b));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
