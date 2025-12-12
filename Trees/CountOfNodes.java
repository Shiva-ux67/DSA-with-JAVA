package Trees;

public class CountOfNodes {
    public static void main(String[] args) {
        TreeNodee root = new TreeNodee(4);
        root.left= new TreeNodee(2);

        root.left.left = new TreeNodee(1);
        root.left.right = new TreeNodee(3);
        root.right= new TreeNodee(6);
        root.right.left= new TreeNodee(5);
        root.right.right= new TreeNodee(7);

        System.out.println(countofnodes(root));
    }
    static  int sum = 0;
    static  int countofnodes(TreeNodee root){

        if ( root == null) return 0;
        // its print the SumOfThe Nodes
        countofnodes(root.left);
        countofnodes(root.right);
         sum += root.data;
        return sum;
        // its counts  how many nodes in the tree
//        return (countofnodes(root.left))+(countofnodes(root.right)) + 1;  // we can replace 1 -> root.data for the for print the sumOf nodes
    }
    }
class TreeNodee{
    int data;
    TreeNodee left;
    TreeNodee right;

    TreeNodee(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
