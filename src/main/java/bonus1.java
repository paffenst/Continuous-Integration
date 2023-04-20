import java.util.Scanner;
public class bonus1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        enterName(name);
        scanner.close();
        System.out.println("\n----------------");
        numNotNull(8);
        System.out.println("\n----------------");
        calculateSquareByNumber(256);
        System.out.println("\n---------------<3");
        System.out.println("\n----<3-<3-<3-<3-<3-<3-<3-<3-<3--");
        System.out.print("Hi " + name + ", nice to see you here today :)");
    }

    public static void enterName(String nname) {
        for (int i = 0; i < 5; ++i) {
            System.out.println(nname);
        }
    }

    public static int numNotNull(int num) {
        if (num > 0) {
            System.out.println("The number is greater than zero.");
        } else {
            System.out.println("The number is less than zero.");
        }
        return 0;
    }

    public static int calculateSquareByNumber(int num) {
        System.out.println("The square of the number is: " + Math.sqrt(num));
        return 0;
    }

}
