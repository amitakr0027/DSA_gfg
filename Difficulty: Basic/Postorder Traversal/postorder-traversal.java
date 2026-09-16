/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
        
    }
    private void postOrder(Node root,ArrayList<Integer> list) {
        if(root==null) return;
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.data);
        
    }
    
}