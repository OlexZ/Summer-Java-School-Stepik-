package DynamicArrayListS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int lenOfList = scan.nextInt();

        for (int i = 0; i <lenOfList; i++) {
            int temp = scan.nextInt();
            result.add(temp);
        }
        int lenOfSecondList = scan.nextInt();
        for (int i = 0; i <lenOfSecondList ; i++) {
            int temp = scan.nextInt();
            result.add(temp);
        }
        Collections.sort(result);
        Collections.reverse(result);
        for (Integer i: result) {
            System.out.println(i);
        }

    }
}
