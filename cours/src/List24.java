import java.util.Scanner;

public class List24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of player: ");
        int playerInt = Integer.parseInt(sc.nextLine());

        int[] score = new int[playerInt];
        int i = 0;
        double total = 0;


        while (i < playerInt) {
            System.out.println("Player's score: ");
            int scoreInt = Integer.parseInt(sc.nextLine());
            score[i] = scoreInt;
            total += scoreInt;
            i += 1;
        }
        total = total / playerInt;
        System.out.println(total);
    }
}
