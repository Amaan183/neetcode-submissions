class Solution {
    public int removeDuplicates(int[] nums) {
        int l=1;
        if(nums.length <1)
        {
            return nums.length;
        }
        //2,10,30,30,30,30
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}