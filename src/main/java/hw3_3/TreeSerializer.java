package hw3_3;

public class TreeSerializer {
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "NULL";
        }

        StringBuilder childrenStr = new StringBuilder();
        if (root.children.isEmpty()) {
            childrenStr.append("NULL");
        } else {
            for (int i = 0; i < root.children.size(); i++) {
                if (i > 0) {
                    childrenStr.append(", ");
                }
                childrenStr.append(serialize(root.children.get(i)));
            }
        }

        return "(" + root.value + ", " + childrenStr.toString() + ")";
    }

    public static void main(String[] args) {
        // Создаем тестовое дерево
        TreeNode root = new TreeNode(1);

        TreeNode child2 = new TreeNode(2);
        TreeNode child3 = new TreeNode(3);
        TreeNode child4 = new TreeNode(4);

        root.addChild(child2);
        root.addChild(child3);
        root.addChild(child4);

        TreeNode child5 = new TreeNode(5);
        TreeNode child6 = new TreeNode(6);
        child2.addChild(child5);
        child2.addChild(child6);

        TreeNode child7 = new TreeNode(7);
        child4.addChild(child7);

        String result = serialize(root);
        System.out.println("Сериализованное дерево:");
        System.out.println(result);
    }
}

