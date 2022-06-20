import java.util.Scanner;

public class exo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a years: ");
        int result = Integer.parseInt(sc.nextLine());
        boolean div4 = result % 4 == 0;
        boolean div100 = result % 100 == 0;
        boolean div400 = result % 400 == 0;
        if ((div4 && div100) || div400) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Not correct");
        }
    }
}

//        if ((result % 4) == 0 && (result / 100) !=0 || (result % 400) == 0){
//            System.out.println("Correct");
//        }
//        else {
//            System.out.println("Not correct");

