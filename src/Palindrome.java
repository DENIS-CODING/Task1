public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " является палиндромом");
        } else {
            System.out.println(str + " не является палиндромом");
        }
    }
}

