/* Structure of Binary Tree Node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	// Constructor
	public Node(int val) {
		data = val;
		left = right = null;
	}
}; */
class Solution {
    public ArrayList<Integer> levelOrder(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        levelOrderRec(root, list);

        return list;
    }

    public void levelOrderRec(Node root, ArrayList<Integer> list) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            Node curr = q.remove();

            list.add(curr.data);

            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
        }
    }
}