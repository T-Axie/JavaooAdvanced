import java.util.Scanner;

public class BoucleBonus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];

        int minimum = 0;
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            number = Integer.parseInt(sc.nextLine());

            if (i == 0) {
                minimum = number;
            }
            else if (number < minimum) {
                minimum =  number;

            }
        }
    }
}
