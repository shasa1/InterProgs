public class LargestNumberFromArray {

    public static void main(String[] salman){

        int num[] = {12,3,444,31,4242};
        int temp=num[0];
        for (int no:num) {
            if(no>temp) {
                temp = no;
            }
        }
        System.out.println("The Largest number in the array is: "+temp);
    }
}
