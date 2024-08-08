import java.util.*;
class TreeNode{
    int value;
    TreeNode right,left;
    TreeNode(int value)
    {
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversals{
    public void Inorder(TreeNode root)
    {
    
        if(root==null)
        return;
        Inorder(root.left);
        System.out.println(root.value+" ");
        Inorder(root.right);
    }
    public void Preorder(TreeNode root)
    {
        if(root==null)
        return;
        System.out.println(root.value+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public void Postorder(TreeNode root)
    {
        if(root==null)
        return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.value+" ");
    
    }

    public static void main(String args[])
    {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.right.left=new TreeNode(8);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);
        TreeTraversals tree=new TreeTraversals();
        System.out.println("Inorder Tree Traversal");
        tree.Inorder(root);
        System.out.println("Preorder Tree Traversal");
        tree.Preorder(root);
        System.out.println("Postorder Tree Traversal");
        tree.Postorder(root);

    }
}

