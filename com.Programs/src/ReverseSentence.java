package Mypackage1;


public class ReverseSentence {

    static String sent = "I like java very much";

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("I like java very much");
        System.out.println(a.reverse());
        String rev = "";

        String splitSent[] = sent.split(" ");
        for (int i = splitSent.length - 1; i >= 0; i--) {

            rev = rev + splitSent[i] + " ";

        }
        System.out.println("Reverse Of a Sentence is: " + rev);
    }

}
