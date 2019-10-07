package Massive;
//abcdef abcfonpq
public class TestJ {
    public static void main(String[] args) {
        String firstWord = "abcdef";
        String secondWord = "fedcloj ";
        int a;
        for (int i = 0; i < firstWord.length(); i++) {
            a = secondWord.indexOf(firstWord.charAt(i));
            if (a == -1)
                System.out.print(firstWord.charAt(i));
        }
        for (int i = 0; i < secondWord.length(); i++) {
            a = firstWord.indexOf(secondWord.charAt(i));
            if (a == -1)
                System.out.print(secondWord.charAt(i));
        }
    }
}
