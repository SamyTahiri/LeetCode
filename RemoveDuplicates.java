import java.util.Arrays;

public class RemoveDuplicates {
  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8 }));
  }

  public static int removeDuplicates(int[] nums) {
    int k = 0;
    int[] stored = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i < nums.length - 1) {
        if (nums[i] == nums[i + 1]) {
          i++;
        } else {
          stored[k] = nums[i];
          k++;
        }
      }
      if (nums[i] == nums.length - 1 && nums[i] == nums[i + 1]) {
        stored[k] = nums[i];
        k++;
      }
    }
    System.out.println(Arrays.toString(stored));
    return k;
  }
}
