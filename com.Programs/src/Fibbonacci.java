package Mypackage1;

import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {

        int a = 0, b = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the fibbonacci: ");
        int n = s.nextInt();
        System.out.print(" " + a + " " + b);
        for (int i = 0; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(" " + temp);
        }
        s.close();
    }

}
