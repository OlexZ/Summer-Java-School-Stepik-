package DynamicArrayListS;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTestS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = {"1", "2", "3", "4", "5", "6", };
        for (int i = a.length -2; i >= 1;i--){
            System.out.println(a[i]);
        }


    }
}
