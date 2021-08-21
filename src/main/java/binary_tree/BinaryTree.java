package binary_tree;

public class BinaryTree {

    public Node root;                             // every binary tree will have a root

    public Node insertNode(Node current, int key) {
        // this checks to see if current node is null and returns a new node if null is true -- this is recursive loop and calls itself until it breaks
            if (current == null) {
                return new Node(key);
        // checks to see if the current node is less than the search parameter and puts it in the left node
            } else if (key < current.getKey()) {
                current.setLeftNode(insertNode(current.getLeftNode(), key));
        // checks to see if the current node is more than the search parameter and puts it in the right node
            } else if (key > current.getKey()) {
                current.setRightNode(insertNode(current.getRightNode(), key));
            } //else {
              //  return current;
            // }
        return current;
    }

    public void add(int key) {
        root = insertNode(root, key);
    }

    @Override
    public String toString() {
        return "binary_tree.BinaryTree{" +
                "root=" + root +
                '}';
    }
}
