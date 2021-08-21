package Mypackage1;

public class palindrome {

    public static void main(String[] args) {

        String name = "PaaP";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);

        }
        if (rev.equals(name))
            System.out.println("The String is Palindrome");
        else
            System.out.println("The String is not Palindrome");

        System.out.println("Original name: " + name + " Reverse name: " + rev);


    }

}