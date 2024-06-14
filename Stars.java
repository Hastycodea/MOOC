import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many stars? ");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < input; i++) {

            for (int j = (input - i -1); j >= 0; j--) {
                printSpace(j);
            }

            printStars(i);

            System.out.println("");
        }

    }

    public static void printSpace(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
}
