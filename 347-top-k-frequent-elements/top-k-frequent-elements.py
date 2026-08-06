from collections import Counter

class Solution:
    def topKFrequent(self, nums, k):
        freq = Counter(nums)

        ans = []

        for num, count in freq.most_common(k):
            ans.append(num)

        return ans 