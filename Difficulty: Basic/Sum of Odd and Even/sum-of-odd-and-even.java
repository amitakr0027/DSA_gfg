class Solution {
    public int[] findSum(int n) {
        // Code here
        int se=0;
        int so=0;
        while(n>0){
            if(n%2==0){
                se+=n;
            } else {
                so+=n;
            }
            n--;
        }
        return new int[]{so,se};
    }
}