/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
     
     static int max;
    
    public int diameter(Node root) {
    max =0;
    levels(root);
    return max;
        
    }
    int levels(Node root) {
        if(root==null) return 0;
        int leftl=levels(root.left);
        int rightl=levels(root.right);
        max=Math.max(max,leftl+rightl);
        return 1+ Math.max(leftl,rightl);
    }
}