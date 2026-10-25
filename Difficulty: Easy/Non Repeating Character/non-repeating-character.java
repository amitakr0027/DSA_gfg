class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        char ans ='$';
        HashMap<Character,Integer> map = new HashMap<>();
        // char[] ch=s.toCharArray();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                ans= s.charAt(i);
                break;
            }
           
        }
        return ans;
    }
}
