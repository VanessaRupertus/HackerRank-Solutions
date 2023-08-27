/*
A Tree class implementing a rooted tree is provided in the editor.
It has the following publicly available methods:

getValue(): Returns the value stored in the node.
getColor(): Returns the color of the node.
getDepth(): Returns the depth of the node. Recall that the depth of a
node is the number of edges between the node and the tree's root,
so the tree's root has depth 0 and each descendant node's depth is
equal to the depth of its parent node +1.

In this challenge, we treat the internal implementation of the tree as
being closed to modification, so we cannot directly modify it; however,
as with real-world situations, the implementation is written in such a
way that it allows external classes to extend and build upon its functionality.
More specifically, it allows objects of the TreeVis class (a Visitor Design Pattern)
to visit the tree and traverse the tree structure via the accept method.

There are two parts to this challenge.

Part I: Implement Three Different Visitors
Each class has three methods you must write implementations for:

getResult(): Return an integer denoting the result, which is different for each class:

The SumInLeavesVisitor implementation must return the sum of the values in the tree's leaves only.

The ProductRedNodesVisitor implementation must return the product of values stored in all red nodes,
including leaves, computed modulo 10^9 + 7. Note that the product of zero values is equal to 1.
The FancyVisitor implementation must return the absolute difference between the sum of values stored
in the tree's non-leaf nodes at even depth and the sum of values stored in the tree's green leaf nodes.
Recall that zero is an even number.

visitNode(TreeNode node): Implement the logic responsible for visiting the tree's non-leaf nodes such
that the getResult method returns the correct result for the implementing class' visitor.

visitLeaf(TreeLeaf leaf): Implement the logic responsible for visiting the tree's leaf nodes
such that the getResult method returns the correct result for the implementing class' visitor.

Part II: Read and Build the Tree
Read the n-node tree, where each node is numbered from 1 to n. The tree is given as a list of
node values (x1,x2,...,xn), a list of node colors (c1,c2,...,cn), and a list of edges.
Construct this tree as an instance of the Tree class. The tree is always rooted at node number 1.

Your implementations of the three visitor classes will be tested on the tree you built
from the given input.
 */
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int result;
    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        // no function
    }

    public void visitLeaf(TreeLeaf leaf) {
        result = result+leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int modulo = 1000000007;

    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % modulo;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            result = (result * leaf.getValue()) % modulo;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int node_sum;
    private int leaf_sum;

    public int getResult() {
        return Math.abs(node_sum - leaf_sum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth()%2 == 0) {
            node_sum = node_sum + node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            leaf_sum = leaf_sum + leaf.getValue();
        }
    }
}

public class Solution {
    private static int[] values;
    private static Color[] colors;
    private static HashMap<Integer, HashSet<Integer>> map;

    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        values = new int[n];
        colors = new Color[n];
        map = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            colors[j] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        // one node tree
        if (n == 1) {
            sc.close();
            return new TreeLeaf(values[0], colors[0], 0);
        }

        for (int k = 0; k < n - 1; k++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            HashSet<Integer> uEdge = map.get(u);
            if (uEdge == null) {
                uEdge = new HashSet<>();
                map.put(u, uEdge);
            }
            uEdge.add(v);

            HashSet<Integer> vEdge = map.get(v);
            if (vEdge == null) {
                vEdge = new HashSet<>();
                map.put(v, vEdge);
            }
            vEdge.add(u);
        }
        sc.close();

        TreeNode root = new TreeNode(values[0], colors[0], 0);
        addNode(root, 1);
        return root;
    }

    public static void addNode(TreeNode parent, Integer pNum) {
        for (Integer num : map.get(pNum)) {
            map.get(num).remove(pNum);

            HashSet<Integer> children = map.get(num);
            Tree tree;
            if (children != null && !children.isEmpty()) {
                tree = new TreeNode(values[num - 1], colors[num - 1], parent.getDepth() + 1);
            } else {
                tree = new TreeLeaf(values[num - 1], colors[num - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            if (tree instanceof TreeNode) {
                addNode((TreeNode) tree, num);
            }
        }
    }
}