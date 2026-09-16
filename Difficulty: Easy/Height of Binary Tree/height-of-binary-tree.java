/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
        // code here
        if(root==null) return -1;
        int h1=height(root.left);
        int h2=height(root.right);
        
        return Math.max(h1,h2)+1;
    }
}