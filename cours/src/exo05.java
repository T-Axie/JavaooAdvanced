import java.util.Scanner;

public class exo05 {
    public static void main(String[] args) {
        int dayTotal, hourTotal, minTotal, secTotal;
        int hour, min, sec;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of second to convert: ");
        secTotal = Integer.parseInt(sc.nextLine());
        sec = secTotal % 60;
        minTotal = secTotal / 60;
        min = minTotal % 60;
        hourTotal = minTotal / 60;
        hour = hourTotal %24;
        dayTotal = hourTotal / 24;


        System.out.println(secTotal +"is equal too "+dayTotal +"day " +hour +"hour " +min +"min " +sec +"sec");
    }
}
