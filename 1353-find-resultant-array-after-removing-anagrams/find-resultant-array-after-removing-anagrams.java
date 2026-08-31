class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (ans.size() == 0 ||
                !isAnagram(ans.get(ans.size() - 1), word)) {
                ans.add(word);
            }
        }

        return ans;
    }

    boolean isAnagram(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }
}