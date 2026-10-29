class Solution {
    int search(int[] arr, int key) {
        // code here
        int ans = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                ans = i;
            }
        }
        return ans;
    }
}