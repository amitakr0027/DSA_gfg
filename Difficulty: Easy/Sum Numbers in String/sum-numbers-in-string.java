class Solution {
    public static int findSum(String s) {
        // code here
       int sum = 0;
               int number = 0;

               for (int i = 0; i < s.length(); i++) {
                   char ch = s.charAt(i);

                   if (Character.isDigit(ch)) {
                       number = number * 10 + (ch - '0');
                   } else {
                       sum += number;
                       number = 0;
                   }
               }
               sum += number;
               return sum;
    }
}