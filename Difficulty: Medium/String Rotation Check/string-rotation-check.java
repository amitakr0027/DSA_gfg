// class Solution {
//     public boolean areRotations(String s1, String s2) {
//         // code here
//         // if(s1.length()!=s2.length())  return false;
//         // for(int i =0;i<s1.length();i++) {
//         //     if(s1.equals(s2)) {
//         //         return true;
//         //     }
//         //     char last = s1.charAt(s1.length() - 1);
//         //     s1 = last + s1.substring(0, s1.length() - 1);
//         // }
//         // return false;
//         // if (s1.length() != s2.length()) {
//         //     return false;
//         // }

//         // String combined = s1 + s1;

//         // return combined.contains(s2);
        
        
        
//     }
    
// }

class Solution {

    public boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String text = s1 + s1;

        return kmp(text, s2);
    }

    static boolean kmp(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        // Build LPS array
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {

                if (len != 0) {
                    len = lps[len - 1];
                } 
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Search pattern in text
        i = 0;
        int j = 0;

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    return true;
                }
            } 
            else {

                if (j != 0) {
                    j = lps[j - 1];
                } 
                else {
                    i++;
                }
            }
        }

        return false;
    }
}