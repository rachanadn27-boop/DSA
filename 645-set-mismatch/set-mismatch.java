class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int repeat = 0;

        for (int num : map.keySet()) {
            if (map.get(num) == 2) {
                repeat = num;
                break;
            }
        }

        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int current = 0;

        for (int num : nums)
            current += num;

        int missing = expected - current + repeat;

        return new int[]{repeat, missing};
    }
}
