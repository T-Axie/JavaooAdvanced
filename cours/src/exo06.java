public class exo06 {
    public static void main(String[] args) {
        int a,b,e;
        a = 3;
        b = 9;
        e = 9;
        boolean c, d;
        c = false;
        d = !c;

        System.out.println(a > 8);
        System.out.println(b==9);

        System.out.println(!c);

        // ou
        System.out.println((a < b) || c);
        System.out.println(a);

        if (a < b) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Or not");
        }
    }
}
