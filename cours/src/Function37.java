public class Function37 {
    public static void main(String[] args) {
        String palindrome = "Anna";
        String word = "rienAvoir";
        System.out.println(palindromicFunction(word));
    }
    public static Boolean palindromicFunction(String word) {
        word = word.toLowerCase();
        if (word.equals(Function36.inverse(word))) {
            return true;
        }
        return false;
    }
}
