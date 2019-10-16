package HashSetANDTreeSet;

import java.util.Scanner;
import java.util.TreeMap;
// iuyfiuyoijinhkjhgi8uhjkjbhgrfiujhlkbjhfuyyiutytdgfdrddstgfjhgiuij;pokp;opoewpojgswdep[iouspogusdpougposuid
public class CounterSymbols {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        String s = stdin.nextLine().toLowerCase();
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                if (map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                else
                    map.put(s.charAt(i),  1);
        }
        for (Character ch: map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }
    }

}
