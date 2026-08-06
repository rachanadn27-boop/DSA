from collections import Counter

class Solution(object):
    def uniqueOccurrences(self, arr):
        freq = Counter(arr)
        return len(freq.values()) == len(set(freq.values()))