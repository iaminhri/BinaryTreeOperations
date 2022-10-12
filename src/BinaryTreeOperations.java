import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTreeOperations{

    BinaryNode rootNode;
    Queue<BinaryNode> treeQ = new LinkedList<>();

    //Breadth-first Traversal.

    public BinaryTreeOperations(){
        //Queue Enqueue.
        rootNode = null;
        rootNode = insertTreeNodes(rootNode, 7);
        insertTreeNodes(rootNode, 4);
        insertTreeNodes(rootNode, 1);
        insertTreeNodes(rootNode, 8);
        insertTreeNodes(rootNode, 10);
        insertTreeNodes(rootNode, 2);
        insertTreeNodes(rootNode, 21);
        insertTreeNodes(rootNode, 5);

        breadthFirstSearch(rootNode);

    }

    public BinaryNode insertTreeNodes(BinaryNode root, int data){

        if(root == null) {
            root = new BinaryNode(data);
            root.left = root.right = null;
        }
        else if(data <= root.info)
            root.left = insertTreeNodes(root.left, data);
        else
            root.right = insertTreeNodes(root.right, data);
        System.out.println(root + " " + root.left + " " + root.right);
        return root;
    }

    public void breadthFirstSearch(BinaryNode newNode){
        treeQ.add(newNode);
        BinaryNode temp;

        while(!treeQ.isEmpty()){
            temp = treeQ.remove();

            System.out.print(temp.displayNode() + ", ");

            if(temp.left != null)
                treeQ.add(temp.left);
            if(temp.right != null)
                treeQ.add(temp.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeOperations treeOperation = new BinaryTreeOperations();
    }
}
