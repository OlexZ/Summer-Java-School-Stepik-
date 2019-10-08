package ProceduresAndFunctionsRecursion;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 7, 4, 9, 3, 8, 1};
        sort(a);

    }
    static void sort(int [] a){
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for (int i = 0; i <a.length - 1; i++) {
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;

                }
            }
        }
    }
}
