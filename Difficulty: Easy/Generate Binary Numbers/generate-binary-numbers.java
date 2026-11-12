class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            
            list.add(Integer.toBinaryString(i));
        }
        return list;
    }
}
