class Solution {
    public boolean isPalindrome(int n) {
       if(n<0){
           n=n*-1;
       }
       int original=n;
       int reversed=0;
       while(n>0){
           int digit = n%10;
           reversed=reversed*10+digit;
           n/=10;
       }
       return reversed==original;
    }
}