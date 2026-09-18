/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        if(root==null) return null;
       
        if(root.data==n1||root.data==n2) return root;
        boolean n1Liesleft= exist(root.left,n1);
        boolean n2Liesleft= exist(root.left,n2);
        if(n1Liesleft && n2Liesleft) return lca(root.left,n1,n2);
        else if(!n1Liesleft && !n2Liesleft) return lca(root.right,n1,n2);
        else return root;
        
    }
    private boolean exist(Node root,int val) {
        if(root==null) return false;
        if(root.data==val) return true;
        return exist(root.left,val)||exist(root.right,val);
    }
    
    
}