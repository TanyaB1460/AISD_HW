package hw3_1;

public class TreeHeight {
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Создаем тестовое дерево
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        System.out.println("Высота всего дерева: " + getHeight(root));
        System.out.println("Высота поддерева с корнем 2: " + getHeight(root.left));
        System.out.println("Высота поддерева с корнем 4: " + getHeight(root.left.left));
        System.out.println("Высота поддерева с корнем 7: " + getHeight(root.left.left.left));
    }
}