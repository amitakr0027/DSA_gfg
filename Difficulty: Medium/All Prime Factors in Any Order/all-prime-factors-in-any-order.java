class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

               for (int i = 2; i * i <= n; i++) {
                          while (n % i == 0) {
                              list.add(i);
                              n /= i;
                          }
                      }

                      if (n > 1) {
                          list.add(n);
                      }

                      return list;
    }
}
