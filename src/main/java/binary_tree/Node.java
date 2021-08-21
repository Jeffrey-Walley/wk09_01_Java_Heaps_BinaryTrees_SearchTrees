package binary_tree;

public class Node {

    private int key;
    private Node leftNode;
    private Node rightNode;

    // constructor
    public Node(int key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    // getters and setters
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "\nbinary_tree.Node{" +
                "\nkey=" + key +
                ", \nleftNode=" + leftNode +
                ", \nrightNode=" + rightNode +
                '}';
    }
}
