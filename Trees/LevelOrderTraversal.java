package Trees;

import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Levelodertree root = new Levelodertree(4);
        root.left= new Levelodertree(2);

        root.left.left = new Levelodertree(1);
        root.left.right = new Levelodertree(3);
        root.right= new Levelodertree(6);
        root.right.left= new Levelodertree(5);
        root.right.right= new Levelodertree(7);

        leverordertraversal(root);
    }
    static void leverordertraversal(Levelodertree root){
        Queue<Levelodertree> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Levelodertree curr = q.poll();
            System.out.print(curr.data + " -> ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}
class Levelodertree{
    int data;
    Levelodertree left;
    Levelodertree right;
    Levelodertree(int data){
        this.data = data;
    }
}
