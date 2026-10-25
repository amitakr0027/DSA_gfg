class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        int ans=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                ans= i+1;
                break;
            }
        }
        return ans;
    }
}
