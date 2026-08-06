class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        freq=Counter(nums)
        for count in freq.values():
            if count > 1:
                return True

        return False