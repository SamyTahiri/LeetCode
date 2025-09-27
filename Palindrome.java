public class Palindrome {
  public static void main(String[] args) {
    isPalindrome(121);
  }

  public static void isPalindrome(int x) {
    String s = Integer.toString(x);
    String reversedS = new StringBuilder(s).reverse().toString();
    if (reversedS.equals(s)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
