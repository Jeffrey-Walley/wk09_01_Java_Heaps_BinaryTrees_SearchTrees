package baeldung_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if(value < current.key) {
            current.leftNode = addRecursive(current.leftNode, value);
        } else if (value > current.key) {
            current.rightNode = addRecursive(current.rightNode, value);
        } else {
            return current;
        }
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }

    public static BinaryTree createBinaryTree() {
        BinaryTree ash = new BinaryTree();

        ash.add(15);
        ash.add(54);
        ash.add(4);
        ash.add(95);
        ash.add(32);
        ash.add(11);
        ash.add(76);
        ash.add(92);
        ash.add(40);

        return ash;
    }

    boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.key) {
            return true;
        }

        return value < current.key                                      // ternary operation
                ? containsNodeRecursive(current.leftNode, value)
                : containsNodeRecursive(current.rightNode, value);
    }

    boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

  public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.print(" " + node.key);
            traverseInOrder(node.rightNode);
        }
  }

  public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);
        }
  }

  public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodey = new LinkedList<>();
        nodey.add(root);

        while (!nodey.isEmpty()) {
            Node node = nodey.remove();
            System.out.print(" " + node.key);

            if (node.leftNode != null) {
                nodey.add(node.leftNode);
            }
            if (node.rightNode != null) {
                nodey.add(node.rightNode);
            }
        }
  }


}


