package ProceduresAndFunctionsRecursion;

public class PrintNS {
    public static void main(String[] args) {
        printN(5);
    }

    private static void printN(int n) {
        for(int a = 1;a <= n;a++){
            for (int b = 0; b < a;b++)
                System.out.print(a);
        }
    }
}
