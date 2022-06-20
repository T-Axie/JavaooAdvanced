import java.util.Random;
import java.util.Scanner;

public class Boucle21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        int price = rng.nextInt(10);
        int result = 0;
        int count = 0;


        while (result != price) {
            System.out.println(price);
            System.out.println("Give me a price: ");
            result = Integer.parseInt(sc.nextLine());
            count += 1;
            if (result < price) {
                System.out.println("The price is higher");
            }
            else if (result > price) {
                System.out.println("The price is lesser");
            }
            else {
                System.out.printf("you find the price in %s try", count);
            }
        }
    }
}
