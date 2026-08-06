from collections import Counter
class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        freq = Counter(s)

        ans = ""

        for ch, count in freq.most_common():
            ans += ch * count

        return ans