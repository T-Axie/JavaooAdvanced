import java.util.Scanner;

public class List23 {
    public static void main(String[] args) {
        int number;
        int exposant;

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.println("Give me a exposant");
        exposant = Integer.parseInt(sc.nextLine());

        int i = 0;
        int result = 1;
        int[] tab = new int[exposant];

        while (i < exposant) {
            result = result * number;
            i++;
            tab[i] = result;
        }
        System.out.println(result);
        for (int element : tab) {
            System.out.println(element);
        }
    }
}
