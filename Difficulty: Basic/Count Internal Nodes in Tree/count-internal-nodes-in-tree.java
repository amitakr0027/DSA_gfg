/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    int countNonLeafNodes(Node root) {
        // code here
        if(root==null) return 0;
        int count=0;
          if(root.left!=null || root.right!=null) {
              count++;
          }
    return count+countNonLeafNodes(root.left)+countNonLeafNodes(root.right);
    
   
    }
}