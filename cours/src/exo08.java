import java.util.Scanner;

public class exo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("It's empty?: true / false ");
        boolean empty = Boolean.parseBoolean(sc.nextLine());
        if (empty) {
            System.out.println("Don't launch the ball!");
        }
        else  {
            System.out.println("Are you ready?: true / false");
            boolean ready = Boolean.parseBoolean(sc.nextLine());
            if (ready) {
                System.out.println("Launch the ball");
            }
            else {
                System.out.println("Don't launch the ball");
            }
        }
    }
}
