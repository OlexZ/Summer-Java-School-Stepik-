package HashSetANDTreeSet;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Ostap Diduk +380987453625
Volodimer Vinarchuk +30935879865
Natalia Ponomarenko +30673214589
Irina Gotsul +30936548532
*/

public class TelephoneNumber {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        for (int i = 0; i < 4; i++) {
            String[] ss = stdin.nextLine().split(" ");
            String name = ss[0] + ss[1];
            String number = ss[2];
            if(map.containsKey(name)){
                map.get(name).add(number);
            }else {
                TreeSet<String> set = new TreeSet<>();
                set.add(number);
                map.put(name, set);
            }
        }
        for (String name: map.keySet()) {
            System.out.print(name + " : ");
            for (String number: map.get(name)) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}
