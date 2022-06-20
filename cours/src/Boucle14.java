import java.util.Scanner;

public class Boucle14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockBall = 3;
        boolean ready;


        while (stockBall > 0 ) {
            System.out.println("Are you ready? true/false");
            ready = Boolean.parseBoolean(sc.nextLine());
            if (ready) {
                stockBall -= 1;
                System.out.println("Launch a ball");
            } else {
                System.out.println("See you next time!");
                }
            }
        System.out.println("No balls anymore!");
    }
}
