public class List28 {
    public static void main(String[] args) {
        int[] tab = new int[] {1,2,3,4,5};
        int x = 3;
        int counter = 0;
        for (int element : tab) {
            if (x == element) {
                System.out.println(counter);
            }
            else {
                counter++;
            }
        }
    }
}
