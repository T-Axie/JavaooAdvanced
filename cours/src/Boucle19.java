import java.util.Scanner;

public class Boucle19 {
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

        while (i < exposant) {
            result = result * number;
            i++;
        }
        System.out.println(result);
    }
}
