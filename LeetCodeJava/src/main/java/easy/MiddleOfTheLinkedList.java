package easy;

public class MiddleOfTheLinkedList {
    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /*
    * Estou fazendo desta forma head.next em diante, porém não é para ser assim;
    * Tem que instancias os valores normais em um outro método.
    * */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head = middleNode(head);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    static ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < (count / 2); i++) {
            current = current.next;
        }
        return current;
    }
}
