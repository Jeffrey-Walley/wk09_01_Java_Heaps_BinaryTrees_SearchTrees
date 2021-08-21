package baeldung_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree ash = BinaryTree.createBinaryTree();

        //assertTrue(ash.containsNode(6));
        //assertTrue(ash.containsNode(1));
        assertTrue(ash.containsNode(40));
    }

   // @Test
   // public void testInOrder() {
   //     BinaryTree ash = BinaryTree.createBinaryTree();
   //    ash.traverseInOrder(ash.root);
   // }

     @Test
    public void testOrder() {
        BinaryTree ash = BinaryTree.createBinaryTree();
        System.out.print(" Calling InOrder Method:  ");
        ash.traverseInOrder(ash.root);
        System.out.print("\n Calling PreOrder Method:  ");
        ash.traversePreOrder(ash.root);

        // breadth-first traverse
         System.out.print("\n Breadth-First(Level-Order) Method: ");
         ash.traverseLevelOrder();

     }
}