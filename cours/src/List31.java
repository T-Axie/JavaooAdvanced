import java.util.Scanner;

public class List31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = new int[] {1,2,3,4};
        int x;
        boolean ready = true;

        while (ready) {
            System.out.println("Give me a number: ");
            x = Integer.parseInt(sc.nextLine());
            boolean find = false;
            for (int element : tab) {
                if (x == element) {
                    System.out.println("Your number is in the list!");
                    find = true;
                }
            }
            if (!find) {
                System.out.println("Not in the list!");
            }
        }
    }
}
