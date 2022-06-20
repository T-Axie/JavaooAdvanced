import java.util.Scanner;

public class exo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name:");
        String name = sc.nextLine();
        System.out.println("What's your surname:");
        String lastname = sc.nextLine();
        System.out.println("Welcome "+name +" " +lastname +"!");

    }
}
