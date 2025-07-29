package DSA_Round2.Tree;

class ListNode {
    ListNode left;
    int data;
    ListNode right;

    ListNode(int data) {
        this.data = data;
    }
}

public class traverssal {
    public static void inOrderTraversal(ListNode root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.println(root.data + " ");
        inOrderTraversal(root.right);

    }

    public static void PreOrderTraversal(ListNode root) {
        if (root == null)
            return;
        System.out.println(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);

    }

    public static void PostOrderTraversal(ListNode root) {
        if (root == null)
            return;
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.println(root.data + " ");

    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.left = new ListNode(2);
        root.right = new ListNode(3);
        root.left.left = new ListNode(4);
        root.left.right = new ListNode(5);

        System.out.print("Inorder traversal");
        inOrderTraversal(root);

        System.out.print("PreOrder Traversal");
        PreOrderTraversal(root);

        System.out.print("PostOrder Traversal");
        PostOrderTraversal(root);
    }

}
