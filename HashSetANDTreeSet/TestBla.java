package HashSetANDTreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class TestBla {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        String[] numOfDigits = stdIn.nextLine().split(" ");
        String[] numOfResult = stdIn.nextLine().split(" ");
        int totalNum = Integer.parseInt(numOfDigits[0]);
        int printNum = Integer.parseInt(numOfDigits[1]);
        for (int i = 0; i < totalNum; i++) {
            treeSet.add(Integer.parseInt(numOfResult[i]));
        }
        System.out.println(treeSet);

    }
}
