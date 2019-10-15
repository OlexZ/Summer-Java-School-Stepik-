package HashSetANDTreeSet;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random r= new Random();
        for (int i = 0; i <1000 ; i++) {
            int t = r.nextInt(50);
            treeSet.add(t);
            hashSet.add(t);
        }
        System.out.println(treeSet + " "  + treeSet.size());
        System.out.println(hashSet + " " + hashSet.size());
    }
}
