package Trees;

public class PreOrderTree {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.right = new Tree(20);
        root.left = new Tree(30);
        root.right.right = new Tree(40);
        root.left.left = new Tree(50);

        preorder(root);
    }
    static  void preorder(Tree root){
        if(root == null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }
}
class Tree{
    int data;
    Tree right;
    Tree left;
    Tree(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
