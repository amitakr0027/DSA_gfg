class Solution {
    public static void utility(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++) {
            if(i%2==0) {
               sb.append(s.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
}