package Trees;

public class BAnaryTree {
    public static void main(String[] args) {
        Nodea root = new Nodea(4);
        root.left= new Nodea(2);

        root.left.left = new Nodea(1);
        root.left.right = new Nodea(3);
        root.right= new Nodea(6);
        root.right.left= new Nodea(5);
        root.right.right= new Nodea(7);

        preoder(root);

    }
    static  void preoder(Nodea root){
        if(root == null) return;
        preoder(root.left);
        preoder(root.right);
        System.out.println(root.data);
    }
}
class Nodea{
    int data;
    Nodea left;
    Nodea right;

    Nodea(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
