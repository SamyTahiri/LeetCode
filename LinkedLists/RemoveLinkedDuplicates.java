public class RemoveLinkedDuplicates {
  public static void main(String[] args) {

  }

  public static ListNode sort(ListNode head) {
    ListNode current = head;
    if (current == null) {
      return null;
    }
    while (current.next != null) {
      if (current.val == current.next.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }
}
