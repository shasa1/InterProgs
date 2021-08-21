package Mypackage1;

public class FactorialDemo {

    public static void main(String[] args) {

        int num = 5;
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        System.out.println("The factorial of the num " + num + " is: " + sum);
    }
}
