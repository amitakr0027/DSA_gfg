/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        lv(root,0,list);
        return list;
    }
    public void lv(Node root,int level,ArrayList<Integer> list) {
        if(root==null) return;
        if(list.size()==level) list.add(root.data);
        lv(root.left,level+1,list);
        lv(root.right,level+1,list);
    }
}