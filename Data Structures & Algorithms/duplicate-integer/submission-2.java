class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> count = new HashSet<>();
        for(int num : nums){
            count.add(num);
        }
        return !(nums.length == count.size());
        
    }
}