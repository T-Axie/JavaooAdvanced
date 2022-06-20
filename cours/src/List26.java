public class List26 {
    public static void main(String[] args) {
        int[] tab = new int[] {5, 8, 1, 2, 3};
        boolean permute;
        int passage = 0;
        int temp;

        do {
            permute = false;
            for (int i = 0; i < tab.length - 1 - passage; i++) {
                if (tab[i] > tab[i+1]) {
                    permute = true;
                    temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = temp;
                }
            }
            passage++;
        } while (permute);
        for (int element : tab) {
            System.out.println(element);
        }
        System.out.printf("Number of while: %s", passage);
    }
}
