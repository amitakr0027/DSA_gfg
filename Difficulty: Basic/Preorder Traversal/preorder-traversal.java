/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    // public ArrayList<Integer> preOrder(Node root) {
    //     //  code here
        
    // }
    
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }
    private void preOrder(Node root,ArrayList<Integer> list) {
        if(root==null){
            return;
        }
        list.add(root.data);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}