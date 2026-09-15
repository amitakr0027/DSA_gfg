class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
       int n = arr.length;

               int[] freq = new int[n + 1];

               // Count frequency
               for (int num : arr) {
                   freq[num]++;
               }

               int duplicate = -1;
               int missing = -1;

               // Find duplicate and missing
               for (int i = 1; i <= n; i++) {

                   if (freq[i] == 2) {
                       duplicate = i;
                   }

                   if (freq[i] == 0) {
                       missing = i;
                   }
               }

               ArrayList<Integer> result = new ArrayList<>();

               result.add(duplicate);
               result.add(missing);

               return result;
    }
}