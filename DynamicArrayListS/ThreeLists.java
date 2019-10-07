package DynamicArrayListS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        String[] firstList = scan.nextLine().split(" ");
        String[] secondList = scan.nextLine().split(" ");
        String[] threeList = scan.nextLine().split(" ");
        int amount = firstList.length + secondList.length + threeList.length;
        int j = 0;
        int q = 0;
        for (int i = 0; i < amount; i++) {
            if (i < firstList.length) {
                if (Integer.parseInt(firstList[i]) > 0)
                    result.add(Integer.parseInt(firstList[i]));
            } else if (j < secondList.length) {
                if (Integer.parseInt(secondList[i]) % 2 == 0)
                    result.add(Integer.parseInt(secondList[j]));
                j++;
            } else if (q < threeList.length) {
                if (Integer.parseInt(threeList[i]) % 7 == 0)
                    result.add(Integer.parseInt(threeList[q]));
                q++;
            }


        }
        Collections.sort(result);
        for (Integer a : result) {
            System.out.print(a);
        }
    }
}
