class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        if (n == 0)
            return list;

        int[] dp = new int[n+1];

        dp[0] = 0;

        if (n >= 1)
            dp[1] = 1;

        int MOD = 1_000_000_007;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        for (int i = 0; i <= n; i++) {
            list.add(dp[i]);
        }

        return list;
    }
}
