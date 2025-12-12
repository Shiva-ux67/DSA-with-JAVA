package Trees;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left= new TreeNode(2);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right= new TreeNode(6);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(7);

        System.out.println(height(root));
    }
    static  int height(TreeNode root){
        if ( root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}