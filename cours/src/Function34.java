public class Function34 {
    public static void main(String[] args) {
        int[] tab = new int[] {1, 2, 3, 4};
        int test = research(tab, tab.length, 6);
        System.out.println(test);
    }
    public static int research(int[] tab, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (value == tab[i])
                return i;
        }
        return -1;
    }
}
