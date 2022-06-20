public class Boucle13 {
    public static void main(String[] args) {
        int number = 2;
        int multiple = 0;


        while (multiple < 10) {
            multiple++;
            System.out.printf("%s * %s = %s \n", multiple, number, multiple * number);
        }
    }
}