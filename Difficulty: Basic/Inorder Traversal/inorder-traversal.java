/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = null;
	}
} */

// class Solution {
// 	public ArrayList<Integer> inOrder(Node root) {
// 		// code here
// 		ArrayList<Integer> list = new ArrayList<>();
// 		if (root == null)
// 			return;
// 			inOrder(root.left,list);
// 			list.add(root.data);
// 			inOrder(root.right,list);
// 		return list;
// 	}
// }
class Solution {

    public ArrayList<Integer> inOrder(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }

    private void inorder(Node root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);

        list.add(root.data);

        inorder(root.right, list);
    }
}