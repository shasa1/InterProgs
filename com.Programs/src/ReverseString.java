package Mypackage1;

public class ReverseString {
    public static void main(String[] args) {

        String name = "SAS";
        String rev = "";
        int count = 0;

        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);

        }
        System.out.println("Original String: " + name + "\tReverse String: " + rev);

        if (rev.equals(name))
            System.out.println("The String is a Palindrome");
        else
            System.out.println("The String is not a Palindrome");


        //
        String Cname = "synechrony";
        int n = Cname.length();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < ((n - 1) - i); j++) {
                if (Cname.charAt(i) == (Cname.charAt(j))) {
                    count++;
                    if (count == 2) {
                        System.out.println("" + Cname.charAt(i));
                    }
                }
            }
        }


        String newCname = Cname.replace("n", "w");
        System.out.println("" + newCname);


    }

}
