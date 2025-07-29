package DSA_Round2.Tree.BinaryTree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class childrenSumTree {
    public static boolean checkChildrenSum(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        boolean leftCheck = checkChildrenSum(root.left);
        boolean rightCheck = checkChildrenSum(root.right);

        int left = (root.left != null) ? root.left.data : 0;
        int right = (root.left != null) ? root.right.data : 0;
        boolean checkSum = (root.data == left + right);

        return leftCheck && rightCheck && checkSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(checkChildrenSum(root));

    }

}
