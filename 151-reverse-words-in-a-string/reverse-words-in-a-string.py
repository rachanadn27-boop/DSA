class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        r=s.strip().split()
        st=r[::-1]
        return " ".join(st)