class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++) {
            if(arr[i]<min) {
                min = arr[i];
                
            }
            if(arr[i]>max) {
                max=arr[i];
            }
            
        }
        list.add(min);
            list.add(max);
        return list;
    }
}
