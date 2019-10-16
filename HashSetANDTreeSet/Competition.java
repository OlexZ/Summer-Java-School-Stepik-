package HashSetANDTreeSet;
import java.util.Scanner;
import java.util.TreeSet;
/*
7 1
2 3 4 5 6 7 1

5 3
1 1 1 1 1
 */
public class Competition {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        String[] numOfDigits = stdIn.nextLine().split(" ");
        String[] numOfResult = stdIn.nextLine().split(" ");
        int totalNum = Integer.parseInt(numOfDigits[0]);
        int printNum = Integer.parseInt(numOfDigits[1]);

        for (int i = 0; i < totalNum; i++) treeSet.add(Integer.parseInt(numOfResult[i]));

        int counter =  0;

        if (printNum <= 0 || printNum > Integer.parseInt(numOfDigits[0]) || printNum > treeSet.size()){
            System.out.println(-1);
        }else
            for (Integer i : treeSet) {
                if (counter < printNum) {
                    System.out.print(i + " ");
                    counter++;
                }
        }
    }
}
