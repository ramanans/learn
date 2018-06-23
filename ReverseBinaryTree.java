


static void reverseTree(final TreeNode root) {
    if (root == null) {
        return;
    }

    final TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;

    if (root.left != null) {
        reverseTree(root.left);
    }

    if (root.right != null) {
        reverseTree(root.right);
    }
}


class Node<T> {
    private final T data;
    private final Node left;
    private final Node right;
    public Node<T>(final T data, final Node left, final Node right) {
        this.data  = data;
        this.left  = left;
        this.right = right;
    }
 }
