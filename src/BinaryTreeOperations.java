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
        rootNode = insertTreeNodes(rootNode, 7); //root node
        insertTreeNodes(rootNode, 4); // inserts the next following elements in BST ordered.
        insertTreeNodes(rootNode, 1);
        insertTreeNodes(rootNode, 8);
        insertTreeNodes(rootNode, 10);
        insertTreeNodes(rootNode, 2);
        insertTreeNodes(rootNode, 21);
        insertTreeNodes(rootNode, 5);

        breadthFirstSearch(rootNode);

        inOrderTraversal(rootNode);
    }

    public void inOrderTraversal(BinaryNode root){
        if(root == null)
            return;
        else{
            inOrderTraversal(root.left);
            root.displayNode();
            inOrderTraversal(root.right);
        }
    }

    //Recursively, adds a node inside a tree using binary search tree concept.

    /**
     * BST -> puts the small number on the left subtrees from the root node and puts the large numbers on the right subtree.
     * @param root -> root node of the tree.
     * @param data -> data that's to be added in the tree.
     * @return -> returns BinaryNode which contains the info of data, left and right subtree's location.
     */

    public BinaryNode insertTreeNodes(BinaryNode root, int data){

        if(root == null) {
            root = new BinaryNode(data);
            root.left = root.right = null;
        }
        else if(data <= root.info)
            root.left = insertTreeNodes(root.left, data);
        else
            root.right = insertTreeNodes(root.right, data);
        /*System.out.println(root + " " + root.left + " " + root.right);*/
        return root;
    }

    /**
     * Implemented breadth-first search/traversal.
     * Prints the output of tree in a level ordered manner.
     * @param newNode -> takes input of a tree's root node.
     */
    public void breadthFirstSearch(BinaryNode newNode){
        treeQ.add(newNode);
        BinaryNode temp;

        while(!treeQ.isEmpty()){
            temp = treeQ.remove();

            temp.displayNode();
            System.out.println("");

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
