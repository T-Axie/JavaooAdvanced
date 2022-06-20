public class FunctionTheorie {
    public static void main(String[] args) {
        String name = "Therence";
        hello(name);
        int[] tab = new int[] {1, 2, 3};
        addFromTab(tab);

        int square = multiple(2);
        System.out.println(square);
        int addition = add(2, 5);
        System.out.println(addition);
    }
    public static void hello(String name) {
        System.out.println("Hello " +name);
    }
    public static void addFromTab (int[] tab) {
        tab[0] = 5;
    }
    public static int multiple(int number) {
        return number * number;
    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
