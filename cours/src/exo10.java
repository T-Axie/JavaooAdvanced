import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("Give me an operator: (only: *,-,+,/) ");
        String operator = sc.nextLine();
        System.out.println("Give me a number: ");
        int number2 = Integer.parseInt(sc.nextLine());

        int result;
        boolean error = false;
        boolean divZero = false;

        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
            case "-":
                System.out.println(number1 - number2);
            case "*":
                System.out.println(number1 * number2);
            case "/":
                System.out.println((double) number1 / number2);
            default:
                System.out.println("Wrong operator");
        }

    }
}
