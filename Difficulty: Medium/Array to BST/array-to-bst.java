/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
       int n =arr.length;
       return convert(arr,0,n-1);
        
    }
    public Node convert(int[] arr, int l , int h){
        if(l>h) return null;
        int mid = (l+h)/2;
        Node root = new Node(arr[mid]);
        root.left=convert(arr,l,mid-1);
        root.right=convert(arr,mid+1,h);
        return root;
    }
}