/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        rv(root,0,list);
        return list;
    }
    public void rv(Node root,int level,ArrayList<Integer> list) {
        if(root==null) return ;
        if(list.size()==level) list.add(root.data);
        rv(root.right,level+1,list);
        rv(root.left,level+1,list);
    }
}