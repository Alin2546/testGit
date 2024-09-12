import java.util.LinkedList;

public class Main {
    public static boolean palindrome(String s) {
        String res = "";

        if (s.length() <= 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }
        if (res.equals(s)) {
            return true;
        }
        return false;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i <= s.length(); i++) {
            list.add(s.substring(0, i));
        }
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (palindrome(list.get(i))) {
                return list.get(i);
            }
        }
        StringBuilder exit = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                exit.append(s.charAt(i));
                exit.append(s.charAt(i + 1));
                break;
            }
        }
        return exit.toString();
    }
        public static void main (String[]args){

        }

}