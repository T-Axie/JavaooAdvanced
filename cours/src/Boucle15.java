public class Boucle15 {
    public static void main(String[] args) {
        int number = 0;
        int multiple = 0;

        while (number < 9) {
            number +=1;
            while (multiple < 20) {
                multiple += 1;
                int result = multiple * number;
                System.out.println(multiple + " x 2 = " + result);
            }
        }
    }
}
