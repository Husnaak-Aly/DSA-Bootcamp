class Tree<T> {
    TreeNode<T> root;

    public Tree(T rootData) {
        root = new TreeNode<>(rootData);
    }

    // Display the entire tree
    public void display() {
        if (root != null) {
            root.display("");
        }
    }
    public void printLeaves(){
        if (root!=null){
            root.printLeaves();
        }
    }
    public void printAllChildren() {
        if (root != null && !root.isLeaf()) {
            root.printAllChildren();
        } else {
            System.out.println("No children available.");
        }
    }

}