class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        for i in range(0, len(nums)):
                target_check = target - nums[i]
                if target_check in hm:
                        return [hm.get(target_check),i]
                else:
                        hm[nums[i]]=i
        
        