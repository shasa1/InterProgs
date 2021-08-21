package Mypackage1;

public class InheritanceDemo_BMW extends InheritanceDemo_Car {

    public static void main(String[] args) {

        InheritanceDemo_Car n1 = new InheritanceDemo_BMW();
        n1.printname();
    }

    public void printname() {
        System.out.println("Name is BMW");
    }

    public void colour() {
        System.out.println("Color is metallic grey");
    }
}
