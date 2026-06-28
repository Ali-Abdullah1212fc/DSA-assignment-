
public class IsSubsequenceBrute {

    public static boolean isSubsequence(String s, String t) {

        int i = 0;

        for (int j = 0; j < t.length() && i < s.length(); j++) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        String s = "abcde";
        String t = "akdbcjjd";

        System.out.println(isSubsequence(s, t));
    }
}