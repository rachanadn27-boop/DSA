
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] a = new int[26];
        int[] b = new int[26];

        if (p.length() > s.length())
            return ans;

        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
            b[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (Arrays.equals(a, b))
                ans.add(i);

            if (i + p.length() < s.length()) {
                b[s.charAt(i) - 'a']--;
                b[s.charAt(i + p.length()) - 'a']++;
            }
        }

        return ans;
    }
}
