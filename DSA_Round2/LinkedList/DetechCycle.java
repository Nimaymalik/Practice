class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

}

public class DetechCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;

    }

    // returning the node in which cycle is present
    public static int hasCycleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        // this code means that there is cycle present
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;

            }
        }
        // now placing the slow pointer to the start
        if (isCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
        return -1;// no cycle present
    }

    // checking the cycle and removing the cycle
    public static ListNode hasCycleNodeAndRemove(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        // this code means that there is cycle present
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;

            }
        }
        // now placing the slow pointer to the start
        if (!isCycle) {
            System.out.println("No Cycle ");
        }
        slow = head;
        ListNode prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        return head;
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = head.next.next.next;

        // System.out.println(hasCycleNode(head));
        ListNode temp = hasCycleNodeAndRemove(head);
        display(temp);

    }

}
