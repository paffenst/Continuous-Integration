import java.util.Scanner;

public class bonusIntermediate {
    public static String[] numOneToTen = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in a range (1-10): ");
        int number = sc.nextInt() - 1;
        System.out.print("Entered number in word is: " + numToWort(number) + "\n" );
        sc.close();
        System.out.println("\n----------------");
        System.out.println("\n " + numHundred());
    }

    public static String numToWort(int num) {
        for (int i = 1; true; ) {
            return numOneToTen[num];
        }
    }

    public static int numHundred() {
        for (int index = 1; index <= 100; ++index) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println("\n#$" + index);
            } else if (index % 5 == 0) {
                System.out.println("$" + index);
            } else if (index % 3 == 0) {
                System.out.println("#" + index);
            } else {
                System.out.println(index);
            }
        }
        return 0;
    }
}
