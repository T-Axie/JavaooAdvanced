public class List32 {
    public static void main(String[] args) {
        int[] tab1 = new int[] {1, 56, 89, 74, 4, 41, 56};
        int[] tab2 = new int[] {3, 58, 87, 73, 6, 39, 61};
        int[] tab3 = new int[14];

        int counter = 0;

        for (int element : tab1) {
            tab3[counter] = element;
            counter++;

        }
        for (int element : tab3) {
            System.out.println(element);
        }
    }
}
