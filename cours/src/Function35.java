public class Function35 {
    public static void main(String[] args) {
        int[] tab1 = new int[] {1, 2, 3, 4, 5, 6};
        int[] tab2 = new int[] {1, 2, 3, 4, 5, 6};
        fusion(tab1, tab2);



    }
    public static int[] fusion (int[] tab, int[] tab2) {
        int[] tab3 = new  int[tab.length + tab2.length - 2];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab3[i];
        }
        return tab3;
    }
}
