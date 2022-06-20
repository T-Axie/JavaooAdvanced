import java.util.Scanner;

public class List22 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] tableau = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Put a number");
            int number = Integer.parseInt(sc.nextLine());
            tableau[i] = number;
        }
        for (int element : tableau) {
            System.out.println(element);
        }
    }
}
