class Solution {
    int missingNum(int arr[]) {
       long n = arr.length+1;
                int sum = 0;


               for(int i = 0;i<arr.length;i++) {
                   sum += arr[i];

               }
               long expSum = n*(n+1)/2;
               return (int)(expSum-sum);
    }
}