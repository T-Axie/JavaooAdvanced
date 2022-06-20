import java.util.Scanner;

public class exo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aString = sc.nextLine();
        System.out.println("What's a:");
        String bString = sc.nextLine();
        System.out.println("What's b:");
        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }
}
