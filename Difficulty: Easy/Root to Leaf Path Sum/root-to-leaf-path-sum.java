/* A Binary Tree node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
	boolean hasPathSum(Node root, int target) {
		// code here
		if(root==null) return false;
		if(root.left==null && root.right==null) return root.data==target;
		 target= target-root.data;
		return hasPathSum(root.left,target) ||hasPathSum(root.right,target);
	}
}
