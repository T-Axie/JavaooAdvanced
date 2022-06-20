import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Function40 {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> guess = new ArrayList<>(Arrays.asList("James", "Yassine", "Therence", "Max"));

        String randomWord = guess.get(rng.nextInt(guess.size()));
        String hiddenWord = "" ;
        int numberOfGame = 0;
        for (int i = 0; i < randomWord.length(); i++) {
            hiddenWord += "*";
        }
        randomWord = randomWord.toLowerCase();
        boolean game = true;
        int counter = 0;
        System.out.println("Easy: *1* | Medium: *2* | Hard: *3* - Pick your difficulties: ");
        int lvl = Integer.parseInt(sc.nextLine());
        switch (lvl) {
            case 1:
                counter = 0;
                System.out.println("Easy mode: You have 10 try.");
                break;
            case 2:
                counter = 3;
                System.out.println("Easy mode: You have 7 try.");
                break;
            case 3:
                counter = 5;
                System.out.println("Easy mode: You have 5 try.");
                break;
        }
        while (game) {
            numberOfGame +=1;
            counter += 1;
            System.out.println("Cheat = " +randomWord);
            System.out.println("Put a letter: ");
            char letter = sc.next().charAt(0);
            for (int i = 0; i < randomWord.length(); i++) {
                if (letter == randomWord.charAt(i)) {
                    hiddenWord = hiddenWord.substring(0,i) + letter + hiddenWord.substring(i + 1);
                }
            }
            System.out.println(hiddenWord);
            System.out.println("Number of try: " +numberOfGame);
            if (counter == 10) {
                game = false;
            }
        }
    }
}
