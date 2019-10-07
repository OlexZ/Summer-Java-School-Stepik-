package loops;

import java.io.IOException;
import java.util.Scanner;

public class looop {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int resSecond = 0;
        int n = in.nextInt();
        int res;
        int len = 0;
        while (n > 0) {
            res = n % 10;
            n /= 10;
            if (res % 2 == 1) {
                len++;
            }else {
                if (resSecond == 0){
                    resSecond = res;
                }else
                    resSecond *= res;
            }
        }
        System.out.print(len+" "+ resSecond);
    }

}




