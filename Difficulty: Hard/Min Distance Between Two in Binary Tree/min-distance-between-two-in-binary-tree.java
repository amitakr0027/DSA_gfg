/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int findDist(Node root, int a, int b) {
       Node LCA= lca(root,a,b);
        int[] dis = {0,0};
        dfs(LCA,a,b,0,dis);
        return dis[0]+dis[1];
        
    }
    private void dfs(Node root,int a,int b,int level,int[] dis) {
        if(root==null) return;
        if(root.data==a) dis[0]=level;
        if(root.data==b) dis[1]=level;
        dfs(root.left,a,b,level+1,dis);
        dfs(root.right,a,b,level+1,dis);
    }
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