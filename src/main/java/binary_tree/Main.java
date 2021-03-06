package binary_tree;
/*

Java Heaps, Binary Trees, and Search Trees

   Trees are Data structures -- they appear upside down compared to what we associate with trees
     in powershell: $ tree
       it will return the file structure in tree form

       -Node - known as the key

       -Edge - connects two nodes to show that there is a relationship between them.
              Every node except the root is connected by one (1) incoming edge from another node. may have several outgoing edges from one node

       -Root - root is the originating node. -- no incoming edges

       -Path - ordered list of nodes that are connected by edges

         -- Children - nodes with incoming edges from the same node are children of that node
         -- Parent - node is the parent of all the nodes it connects to with outgoing edges
         -- Sibling - nodes in the tree that are children of the same parent are siblings

       - Subtree - set of nodes and edges comprised of the parent and all descendants

       - Leaf Node - the end of the path along the tree as it is a node that has no children

      every 'node' has a path length of 0 to itself (it is itself and needs go nowhere)
          -- every node has only 1 path from the root
             - depth: length of the path from the root to the node
             - height: length of the longest path from the node to the leaf (the leaf will have a height of 0)
             - height of tree: height of the root
          ** Root has a depth of 0
          ** Leaf has a height of 0

    a Binary Tree works like a linkedList, but each node holds a reference of 2 other objects

     -a Full Binary Tree is a tree in which every node (except for the leaves) has exactly 2 children
     -a Complete Binary Tree is full and all the nodes are as far to the left as possible

  Tree Traversal
    1 - Depth First - travel down the path towards leaves until forced to stop
        a- PreOrder - visit Root then recursively visit children L to R
        b- PostOrder - visit children L to R then visit Root
        c- InOrder - visit L child, then Root, then R child


    2 - Breadth First - basic idea is to visit all children of a node before going deeper down paths


BINARY SEARCH TREE (BST)
------------------------

node-based binary tree data structure has the following properties:
  - L subtree of a node only contains nodes with keys less than the node's key
  - R subtree of node only contains nodes with keys greater than the node's key
  - L & R subtree must also each be a binary search tree

  Binary Search Tree is great for less than greater than values. ex: alphabetical order
      -- set 1 name as the root search point and then have names that order before (less than) the root to the left
           and the items that would be after the root (greater than) to the right

 Traversing a BST (Binary Search Tree)
     BST search makes 3 comparisons - Array search makes 7 comparisons

     BST Search:
      1: start at root
      2: if search key is less than index go to the left child, if search is greater than index then go to the right child

      this process continues until the element is found or the end of the tree is found (in which case the element does not exist)
         with 3 comparisons we have found the element or else it does not exist

    -- binary search tree implementation - see wk09_01_Java* days code


** HEAPS **

  Heaps are specialized Binary Trees with 2 additional characteristics / rules
     because of the rules you only use a heap when you care about the highest or lowest value

   rules of the heaps
  1. tree must be complete and balanced (structure property)
      -- must be filled out top-to-bottom, left to right
  2. tree must follow certain ordering rules (order property)

2 different kinds of Heaps:

  Min Heaps - 'parent' value <= to 'children', smallest value will always be at the top

  Max Heaps - 'parent' value >= to 'children', largest value will always be at the top


BINARY HEAP IMPLEMENTATION ____ ???

    Structure property allows very efficient representation with an array
      - leave slot 0 unused
      - store node val as an array element
      - for a node in slot i
             -- the parent is at i/2 (floor, int division)
             -- left child is 2*i
             -- Right child is (2*i)+1

Binary Heap Insert Operation
  1 - put new val in next open slot in array / tree
  2 - swap/bubble up values towards root until heap-order is achieved

// max heap insertion -- lab and code -- in intelliJ ((this example did not work))

Binary Heap Deletion -


questions:

    1. consider min binary heap. in the array used to represent it at what subscript will we
       find the parent of the element stored at subscript 43?  a)42  b)21  c) 22  d)86  e)87
       --parent is at i/2, so the answer is b)21

    2. consider min binary heap. in the array used to represent it at what subscript will we
       find the right child of the element stored at subscript 43? a)44  b)45  c)21  d)86  e)87
       --right node is (2*i)+1, so the answer is e)87


Baeldung example --

Depth First Searches - first examples are Depth First
---------------------
preOrder traverse root, then left nodes, then right nodes
postOrder traverse left node, right node, then root last
inOrder

Breadth First Search - visit all nodes of a level before going to a new level
--------------------	-- also known as Level Order Traversal
                -- visits all levels starting at root and moving left to right

Queue is similar to LinkList

 */

public class Main {

    public static void main(String[] args) {
        BinaryTree trelvyn = new BinaryTree();

        int[] nodes = {7, 12, 8, 6, 15, 98, 54, 13, 64, 99, 23, 2, 37, 90, 1007, 4, 63, 72, 85};

        for (int n : nodes ) {
            trelvyn.add(n);
        }
        System.out.println(trelvyn);
    }

}
