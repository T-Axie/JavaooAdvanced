public class List25 {
    public static void main(String[] args) {
        int[] age = new int[] {18, 4, 23};
        int[] age2 = new int[3];
        int counter = 3;

        for (int element : age) {
            counter -= 1;
            age2[counter] = element;
        }

        for (int elem : age2) {
            System.out.println(elem);
        }
    }
}
