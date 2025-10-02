public class FirstBadVersion {
  public static void main(String[] args) {

  }

  public static int firstBadVersion(int n) {
    int low = 0;
    int high = n - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (isBadVersion(mid)) { // THERE IS AN isBadVersion API IN LEETCODE
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
}
