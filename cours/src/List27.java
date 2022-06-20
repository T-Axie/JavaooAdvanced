import java.util.Scanner;

public class List27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] tab = new int[10];
        int counter = 0;

        while (counter < 10) {
            System.out.println("Put the number: ");
            int number = Integer.parseInt(sc.nextLine());
            tab[counter] = number;
            counter++;
        }
        int minimum = tab[0];
        for (int element : tab) {
            if (element < minimum) {
                minimum = element;
            }
        }
        System.out.println(minimum);
    }
}
