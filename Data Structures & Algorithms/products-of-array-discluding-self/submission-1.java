class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];
        int prefixVal = prefix[0];
        int suffixVal = nums[nums.length-1];
        int[] answer = new int[nums.length];

        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefixVal*nums[i];
            suffix[nums.length-1-i] = suffixVal*nums[nums.length-1-i];
            prefixVal = prefix[i];
            suffixVal = suffix[suffix.length-1-i];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(i == 0)
            {
                answer[i]=suffix[1];
            }
            else if(i == nums.length-1)
            {
                answer[i] = prefix[i-1];
            }
            else
            {
                answer[i] = prefix[i-1] * suffix[i+1];
            }
        }
        return answer;

    }
}  
