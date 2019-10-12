package StaticVariablesAndMethods;
import java.util.*;

public class StartCounter2 {
    static int counter = 0;
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        foo(stdin.nextInt());
        System.out.println(counter);
    }
    static int foo(int n){
        counter++;
        return n < 2 ? 1 : foo(n-1) + foo(n-2);
    }
}
