public class ReverseInteger {
  public static void main(String[] args) {
    System.out.println(reverse(-2147483412));
  }

  public static int reverse(int x) {
    int reversed = 0;
    while (x != 0) {
      int digit = x % 10;
      reversed = reversed * 10 + digit;
      x = x / 10;

      if (reversed >= Integer.MAX_VALUE / 10) {
        return 0;
      }
      if (reversed <= Integer.MIN_VALUE) {
        return 0;
      }

      if (reversed == -2147483648) {
        return 0;
      }
    }
    return x = reversed;
  }

}
