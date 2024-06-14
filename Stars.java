import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height? ");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= input; i++) {

            int stars = (i * 2) - 1;
            int space = input - i;

            if (stars % 2 == 1) {
                printSpace(space);
                printStars(stars);
                System.out.println("");
            }

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
