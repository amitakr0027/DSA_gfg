class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key= entry.getKey();
            int value=entry.getValue();
            ArrayList<Integer> temp=new ArrayList<>();
        temp.add(key);
            temp.add(value);
            list.add(temp);
            
        } 
        return list;
    }
}