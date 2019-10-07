package loops;

import java.util.Scanner;

public class MinimumofNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, res = Integer.MAX_VALUE;
        while (in.hasNextInt()){
            a = in.nextInt();
            if(a< res && a != 0){
                res = a;
            }
        }
        System.out.println(res);

    }
}
