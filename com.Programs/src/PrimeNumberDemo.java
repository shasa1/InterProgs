package Mypackage1;

import java.util.Scanner;

public class PrimeNumberDemo {
    static Scanner s;

    public static void main(String[] args) {
        int num;

        do {
            boolean flag = true;
            System.out.print("Enter the number: ");
            s = new Scanner(System.in);
            num = s.nextInt();

            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    flag = false;
            }
            if (flag)
                System.out.println("The number is a prime number");
            else
                System.out.println("The number is not a prime number");
        } while (num != 1);
    }

}
