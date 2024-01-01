package easy;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        head = removeElements(head, 6);

        ListNode.display(removeElements(head, 6));
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode newList = new ListNode(0);
        newList.next = head;
        ListNode current = newList;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return newList.next;
    }
}
