public class Function36 {
    public static void main(String[] args) {
        String word = "tableau";
        System.out.println(inverse(word));
    }
    public static String inverse (String name) {
        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result += name.charAt(i);

        }
        return result;
    }
}
