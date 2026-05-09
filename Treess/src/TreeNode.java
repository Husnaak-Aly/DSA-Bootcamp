import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    // Add a child node
    public void addChild(TreeNode<T> child) {
        this.children.add(child);
    }

    // Display the tree in a simple format
    public void display(String prefix) {
        System.out.println(prefix + data);
        for (TreeNode<T> child : children) {
            child.display(prefix + "--");
        }
    }
  public void printAllChildren() {
      for (TreeNode<T> child : children) {
          System.out.println(child.data);
          child.printAllChildren();
      }
  }

    public boolean isLeaf(){
        return children.isEmpty();
    }
    public void printLeaves() {
        // If the node is a leaf, print it
        if (isLeaf()) {
            System.out.println(data);
        }
        // Otherwise, traverse the children
        else {
            for (TreeNode<T> child : children) {
                child.printLeaves(); // Recursively call printLeaves on each child
            }
        }
    }

}
