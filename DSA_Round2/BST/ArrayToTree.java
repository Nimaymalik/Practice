package DSA_Round2.BST;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class ArrayToTree {
    public static TreeNode sortedArrayToBST(int[] arr) {
        return constructTree(arr, 0, arr.length - 1);
    }

    public static TreeNode constructTree(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = (left + right) / 2;
        TreeNode head = new TreeNode(nums[mid]);

        head.left = constructTree(nums, left, mid - 1);
        head.right = constructTree(nums, mid + 1, right);

        return head;

    }

    public static void display(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.println(head.val + " ");
        display(head.left);
        display(head.right);

    }

    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode result = sortedArrayToBST(nums);
        display(result);

    }

}
