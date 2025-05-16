package hw3_2;

public class TreeSerializer {
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "NULL";
        }

        String leftStr = serialize(root.left);
        String rightStr = serialize(root.right);

        return "(" + root.value + ", " + leftStr + ", " + rightStr + ")";
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        String serialized = serialize(root);
        System.out.println(serialized);
    }
}
