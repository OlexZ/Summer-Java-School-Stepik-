package HashSetANDTreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class JUnitTestStepikExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        String[]a = {"aA", "aa", "aaa", "aAa", "aaA"};
        set.addAll(Arrays.asList(a));

        for(String i : set) System.out.print(i + " ");
    }

}
