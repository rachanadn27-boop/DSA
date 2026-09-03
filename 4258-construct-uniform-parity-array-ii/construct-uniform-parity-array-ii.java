class Solution {
    public boolean uniformArray(int[] nums1) {
        int mo = Integer.MAX_VALUE;
        int me = Integer.MAX_VALUE;
        for (int x : nums1) {
            if (x % 2 == 0) {
                me = Math.min(me, x);
            } else {
                mo = Math.min(mo, x);
            }
        }
        if (mo == Integer.MAX_VALUE) {
            return true;
        }
        return mo < me;
    }
}