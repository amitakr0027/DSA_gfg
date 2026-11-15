class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        // int a = Integer.parseInt(s1, 2);
        // int b =Integer.parseInt(s2,2);
        
        // int c=a+b;
        // return Integer.toBinaryString(c);
        
        BigInteger a = new BigInteger(s1, 2);
               BigInteger b = new BigInteger(s2, 2);

               BigInteger c = a.add(b);

               return c.toString(2);
    }
}