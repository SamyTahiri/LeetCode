public class Palindrome {
  public static void main(String[] args) {
    isPalindrome(123);
  }

  public static boolean isPalindrome(int x) {
    String s = Integer.toString(x);
    String reversedS = new StringBuilder(s).reverse().toString();
    return reversedS.equals(s);
  }
}
