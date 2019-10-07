package DynamicArrayListS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IdenticalItemsFromTwoLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        String[] fLine = scan.nextLine().split(" ");
        String[] sLine = scan.nextLine().split(" ");
        for (String value : fLine) {
            for (String s : sLine) {
                if (value.equals(s) && !result.contains(Integer.parseInt(value))) {
                    result.add(Integer.parseInt(value));
                    break;
                }
            }
        }
        Collections.sort(result);
        for (Integer i: result) {
            System.out.print(i + " ");
        }

    }
}
