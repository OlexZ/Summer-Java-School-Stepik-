package DynamicArrayListS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        boolean sw = true;
        String create = scan.next();
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++)
            result.add(i);
        while (sw){
            String[] t = scan.nextLine().split(" ");
            System.out.println(Arrays.toString(t));
            if (t[0].equals("printList")) {
                sw = false;
            } else if (t.length == 2 && t[0].equals("add")) {
                result.add(Integer.parseInt(t[1]));
            } else if (t.length == 3 && t[0].equals("add")) {
                result.add(Integer.parseInt(t[1]), Integer.parseInt(t[2]));
            } else if (t[0].equals("remove")) {
                result.remove(Integer.parseInt(t[1]));
            } else if (t[0].equals("set")) {
                result.set(Integer.parseInt(t[1]), Integer.parseInt(t[2]));
            }
        }
        for (Integer i : result) {
            System.out.print(i + " ");
        }


    }
}
