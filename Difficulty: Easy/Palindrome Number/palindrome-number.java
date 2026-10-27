class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int reverse=0;
        
        if(n<0){
            n=n*-1;
        }
        int original = n;
        while(n>0){
            int digit = n%10;
             reverse = reverse*10+digit;
             n/=10;
        }
       
        return reverse==original;
    }
}