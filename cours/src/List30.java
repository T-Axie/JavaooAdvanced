import java.util.Scanner;

public class List30 {
    public static void main(String[] args) {
        int[] tab = new int[] {1, 2, 3, 5, 7, 0};
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel valeur voulez-vous insérer?");
        int value = Integer.parseInt(sc.nextLine());

        int posValue = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] < value) {
                posValue++;
            }
        }
        for (int i = tab.length -1; i > posValue; i--) {
            tab[i] = tab[i-1];
        }
        tab[posValue] = value;
        for (int element : tab) {
            System.out.println(element);
        }
    }
}
