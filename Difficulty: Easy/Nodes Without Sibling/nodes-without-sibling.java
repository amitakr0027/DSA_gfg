/* Definition of Tree Node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int val) {
		data = val;
		left = right = null;
	}
};
*/

class Solution {
	public List<Integer> noSibling(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		sb(root, list);
		if (list.size() == 0) {
			list.add(-1); }	else {
				Collections.sort(list);
			}
			
			return list;
			
		}
		public void sb(Node root, ArrayList<Integer> list) {
			if (root == null)
				return;
			sb(root.left, list);
			sb(root.right, list);
			if (root.left != null && root.right == null)
				list.add(root.left.data);
			if (root.right != null && root.left == null)
				list.add(root.right.data);
			
		}
	}
