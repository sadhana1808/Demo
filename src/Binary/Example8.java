package Binary;

// Java program for recursive level order traversal in
// spiral form
//Level order traversal of Binary Tree in Spiral form Using Recursion:

/* A binary tree node has data, pointer to left child
and a pointer to right child */

//Input:                    1
//                      /       \
//                     2         3
//                   /  \       /  \
//                  7    6     5    4


//Output: 1 2 3 4 5 6 7
//Explanation:
//Level 1: 1
//Level 2: 2 3
//Level 3: 7 6 5 4
//Nodes are traversed in the alternate order from front or back in adjacent levels , so the output is 1 2 3 4 5 6 7.

class Example8 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    Node root;

    // Function to print the spiral traversal of tree
    void printSpiral(Node node)
    {
        int h = height(node);
        int i;

		/* ltr -> left to right. If this variable is set
		then the given label is traversed from left to
		right */
        boolean ltr = false;
        for (i = 1; i <= h; i++) {
            printGivenLevel(node, i, ltr);

            /*Revert ltr to traverse next level in opposite
             * order*/
            ltr = !ltr;
        }
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node node)
    {
        if (node == null)
            return 0;
        else {

            /* compute the height of each subtree */
            int lheight = height(node.left);
            int rheight = height(node.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    /* Print nodes at a given level */
    void printGivenLevel(Node node, int level, boolean ltr)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1) {
            if (ltr != false) {
                printGivenLevel(node.left, level - 1, ltr);
                printGivenLevel(node.right, level - 1, ltr);
            }
            else {
                printGivenLevel(node.right, level - 1, ltr);
                printGivenLevel(node.left, level - 1, ltr);
            }
        }
    }
    /* Driver program to test the above functions */
    public static void main(String[] args)
    {
        Example8  tree = new Example8();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println(
                "Spiral order traversal of Binary Tree is ");
        tree.printSpiral(tree.root);
    }
}

// This code has been contributed by Mayank
// Jaiswal(mayank_24)
