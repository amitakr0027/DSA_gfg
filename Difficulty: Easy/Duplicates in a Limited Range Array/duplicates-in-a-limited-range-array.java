class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr) {
            if(!map.containsKey(num)) map.put(num,map.getOrDefault(num,0)+1);
            else list.add(num);
        }
        return list;
       
        
    }
}