import java.util.Scanner;

public class Boucle16 {
    public static void main(String[] args) {
        int price = 10;
        int result = 0;

        Scanner sc = new Scanner(System.in);

        while (result != 10) {
            System.out.println("Give me a price: ");
            result = Integer.parseInt(sc.nextLine());
            if (result < price) {
                System.out.println("The price is higher");
            }
            else if (result > price) {
                System.out.println("The price is lesser");
            }
            else {
                System.out.println("you find the price!");
            }
        }
    }
}
