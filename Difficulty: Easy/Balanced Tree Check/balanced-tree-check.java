/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        if (root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        if (Math.abs(lh-rh)<2){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
    int height(Node root) {
        if (root==null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}