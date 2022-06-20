import java.util.Scanner;

public class List29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[] {1,0,0,0,0,0,0,0,0,0};
        boolean ready = true;

        int counter = 0;
        int temp;

        while (ready) {
            System.out.println("Move your object with: l(eft), r(ight), q(uit)");
            String move = sc.nextLine();
            switch (move) {
                case "l":
                    if (counter == 0) {
                        System.out.println("You are at the limit!");
                        break;
                    }
                    System.out.println("Your object move to left");
                    temp = tab[counter -1];
                    tab[counter -1] = tab[counter];
                    tab[counter] = temp;
                    counter -=1;
                    System.out.println(tab[0]);
                    System.out.println(tab[1]);
                    System.out.println(tab[2]);
                    System.out.println(tab[3]);
                    System.out.println(tab[4]);
                    System.out.println(tab[5]);
                    System.out.println(tab[6]);
                    System.out.println(tab[7]);
                    System.out.println(tab[8]);
                    System.out.println(tab[9]);
                    break;
                case "r":
                    if (counter == 9) {
                        System.out.println("You are at the limit!");
                        break;
                    }
                    System.out.println("Your object move to right");
                    temp = tab[counter +1];
                    tab[counter +1] = tab[counter];
                    tab[counter] = temp;
                    counter +=1;
                    System.out.println(tab[0]);
                    System.out.println(tab[1]);
                    System.out.println(tab[2]);
                    System.out.println(tab[3]);
                    System.out.println(tab[4]);
                    System.out.println(tab[5]);
                    System.out.println(tab[6]);
                    System.out.println(tab[7]);
                    System.out.println(tab[8]);
                    System.out.println(tab[9]);
                    break;
                case "q":
                    System.out.println("See you next time!");
                    ready = false;
                    break;
            }
        }
    }
}
