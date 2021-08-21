package Mypackage1;

public class UsingReccursion {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("factorial of number '" + num + "' is: " + factNum(num));
    }

    private static int factNum(int num) {
        System.out.println("num value: " + num);
        if (num == 1)
            return 1;
        else
            return num * factNum(num - 1);

    }
}
