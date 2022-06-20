public class Function38 {
    public static void main(String[] args) {
       pair(90, 80);
    }

    public static void pair(int value, int value2) {
        for (int i = value + 1; i <= value2 -1; i ++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
