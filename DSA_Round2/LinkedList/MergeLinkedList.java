class ListNode {
    int data;
    ListNode next;

    ListNode() {
    }

    ListNode(int data) {
        this.data = data;
    }
}

public class MergeLinkedList {
    public static ListNode mergeLL(ListNode head1, ListNode head2) {
        ListNode temp = new ListNode(0);
        ListNode flag = temp;

        ListNode first = head1;
        ListNode second = head2;

        while (first != null && second != null) {
            if (first.data < second.data) {
                flag.next = first;
                first = first.next;

            } else {
                flag.next = second;
                second = second.next;

            }
            flag = flag.next;

        }
        if (first != null) {
            flag.next = first;
        }
        if (second != null) {
            flag.next = second;
        }

        return temp.next;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // first linked list
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        // second linked list
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        // printing the sorted linked list
        ListNode temp = mergeLL(head1, head2);
        display(temp);
    }

}
