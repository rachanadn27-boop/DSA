class Solution {
    TreeMap<Integer, Integer> a = new TreeMap<>(), b = new TreeMap<>();
    int na = 0, nb = 0;
    long sa = 0, sb = 0;
    void ins(TreeMap<Integer, Integer> m, int v) {
        m.merge(v, 1, Integer::sum);
    }
    void del1(TreeMap<Integer, Integer> m, int v) {
        int c = m.get(v);
        if (c == 1) m.remove(v);
        else m.put(v, c - 1);
    }
    void fix() {
        while (na > nb + 1) {
            int v = a.lastKey();
            del1(a, v);
            na--;
            sa -= v;
            ins(b, v);
            nb++;
            sb += v;
        }
        while (nb > na) {
            int v = b.firstKey();
            del1(b, v);
            nb--;
            sb -= v;
            ins(a, v);
            na++;
            sa += v;
        }
    }
    void add(int v) {
        if (na == 0 || v <= a.lastKey()) {
            ins(a, v);
            na++;
            sa += v;
        } else {
            ins(b, v);
            nb++;
            sb += v;
        }
        fix();
    }
    void del(int v) {
        if (a.containsKey(v)) {
            del1(a, v);
            na--;
            sa -= v;
        } else {
            del1(b, v);
            nb--;
            sb -= v;
        }
        fix();
    }
    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] y = new long[n - x + 1];
        for (int i = 0; i < n; i++) {
            add(nums[i]);
            if (i >= x) del(nums[i - x]);
            if (i >= x - 1) {
                long m = a.lastKey();
                y[i - x + 1] = m * (long) na - sa + sb - m * (long) nb;
            }
        }
        long[][] dp = new long[k + 1][n + 1];
        for (long[] row : dp) Arrays.fill(row, Long.MAX_VALUE);
        for (int i = 0; i <= n; i++) dp[0][i] = 0;
        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1];
                if (i >= x && dp[j - 1][i - x] != Long.MAX_VALUE) dp[j][i] = Math.min(dp[j][i], dp[j - 1][i - x] + y[i - x]);
            }
        }
        return dp[k][n];
    }
}