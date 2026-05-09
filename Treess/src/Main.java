public class Main {
    public static void main(String[] args) {
        // Create a tree with root node "A"
        Tree<String> tree = new Tree<>("A");

        // Add children to root node
        TreeNode<String> nodeB = new TreeNode<>("B");
        TreeNode<String> nodeC = new TreeNode<>("C");
        tree.root.addChild(nodeB);
        tree.root.addChild(nodeC);

        // Add children to node B
        TreeNode<String> nodeD = new TreeNode<>("D");
        TreeNode<String> nodeE = new TreeNode<>("E");
        nodeB.addChild(nodeD);
        nodeB.addChild(nodeE);

        // Add children to node C
        TreeNode<String> nodeF = new TreeNode<>("F");
        nodeC.addChild(nodeF);

        // Display the tree
        tree.display();

        System.out.println("Leaf Nodes");
        tree.printLeaves();
       // System.out.println("Children");
        System.out.println("All Child");
        tree.printAllChildren();
    }
}
