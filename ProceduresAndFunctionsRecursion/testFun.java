package ProceduresAndFunctionsRecursion;

import java.util.Scanner;

public class testFun {
    public static void main(String[] args) {
            int temp;
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("Введите число для проверки:");

            
            int num=scan.nextInt();

            
            for (int i=2; i<=num/2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                System.out.println(num + " - простое число");
            } else {
                System.out.println(num + " - составное число");
            }

    }
}
