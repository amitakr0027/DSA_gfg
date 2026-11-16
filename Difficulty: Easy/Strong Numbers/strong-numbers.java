class Solution {
    public boolean isStrong(int n) {
        int original = n;
        int sum=0;
        while(n>0){
            int digit= n%10;
            sum+=fact(digit);
            n/=10;
            
            
        }
         return original==sum;
        
    }
    public int fact(int digit){
        if(digit<=1) return 1;
        return digit*fact(digit-1);
        
    }
   
}