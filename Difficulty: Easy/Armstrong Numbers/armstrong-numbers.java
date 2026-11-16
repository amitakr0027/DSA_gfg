class Solution {
    public boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int count=0;
        int sum=0;
        while(n>0){
            count++;
            n/=10;
        }
         n = original; 
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,count);
            n/=10;
            
        }
        return sum==original;
    }
}