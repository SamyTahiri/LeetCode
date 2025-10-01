package LinkedLists;

public class ReverseLinkedList {
  public static void main(String[] args) {

  }

  public static ListNode reverseList(ListNode head) {
    ListNode current = head;
    ListNode previous = null;
    ListNode next;
    while (current != null) {
      next = current.next;

      current.next = previous;

      previous = current;
      current = next;
    }
    return head;
  }
}
