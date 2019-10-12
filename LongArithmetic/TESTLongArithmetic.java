package LongArithmetic;
import java.util.*;
import java.math.BigInteger;

public class TESTLongArithmetic {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(stdIn.next());
        System.out.println(f(bigInteger));
    }
    static BigInteger f (BigInteger n){
        return n.equals(BigInteger.ONE) ? n : n.multiply((f(n.add(new BigInteger("-1")))));
    }

}
