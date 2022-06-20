import java.util.*;


public class Function41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> initialColor = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> randomColor = new ArrayList<>(Arrays.asList(-1, -1, -1, -1));
        ArrayList<Integer> choice = new ArrayList<>();

        Collections.shuffle(initialColor);
        for (int i = 2; i < initialColor.size(); i++) {
            randomColor.set(i -2, initialColor.get(i));
        }
        boolean game = true;
        while (game) {
            System.out.println("Cheat: " +randomColor);
            System.out.println("What do you think? (ex: 1 4 3 5)");
            String[] numbers = sc.nextLine().split("\\s");

            for (String number : numbers) {
                choice.add(Integer.parseInt(number));
            }
            for (int i = 0; i < choice.size(); i++) {
                boolean b = Objects.equals(choice.get(i), randomColor.get(i));
                if (b) {
                    System.out.println("Red Flag");
                }
            }
            System.out.println(choice);
        }
    }
}
