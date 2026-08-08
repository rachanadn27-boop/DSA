class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        s=s.strip().split()
        rw=s[::-1]
        return " ".join(rw)