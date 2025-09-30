public class MergeTwoLists {

  public static void main(String[] args) {

    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

    printList(list1);
    printList(list2);

    ListNode mergedLists = merge(list1, list2);
    printlist(mergedlists);

  }

  public static ListNode merge(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(-1);
    ListNode tail = dummy;
    ListNode head = dummy.next;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }
    return head;
  }

  public static void printList(ListNode head) {
    ListNode current = head;

    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }
}
