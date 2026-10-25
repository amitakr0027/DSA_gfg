class Solution {
    public boolean checkBinary(String s) {
        // code here
        boolean seenOne = false;
                boolean seenZeroAfterOne = false;

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch == '1') {
                        if (seenZeroAfterOne) {
                            return false;
                        }
                        seenOne = true;
                    } else if (ch == '0' && seenOne) {
                        seenZeroAfterOne = true;
                    }
                }

                return true;
    }
}