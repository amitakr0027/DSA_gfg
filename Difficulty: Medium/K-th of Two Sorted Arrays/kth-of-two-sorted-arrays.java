class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
               int m = b.length;

               ArrayList<Integer> list = new ArrayList<>();

               // Add elements of a
               for (int i = 0; i < n; i++) {
                   list.add(a[i]);
               }

               // Add elements of b
               for (int j = 0; j < m; j++) {
                   list.add(b[j]);
               }

               // Sort the combined list
               Collections.sort(list);

               // k is 1-based
               return list.get(k - 1);
    }
}