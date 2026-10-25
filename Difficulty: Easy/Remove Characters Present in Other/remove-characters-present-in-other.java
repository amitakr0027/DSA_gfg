class Solution {
    public String removeChars(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            if(s2.indexOf(ch)==-1){
                sb.append(ch);
            }
           
            
        }
        return sb.toString();
    }
}