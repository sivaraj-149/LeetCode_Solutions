// Binary Tree Inorder Traversal

// Given the root of a binary tree, return the inorder traversal of its nodes' values.

class InOrderTraversal{
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(result,root);

        return result;
    }
    public void inOrder(List<Integer> result, TreeNode root){
        if(root == null)    return ;
        inOrder(result, root.left);
        result.add(root.val);
        inOrder(result, root.right);
    }
}
