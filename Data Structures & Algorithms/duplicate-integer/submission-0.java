class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            if(!count.containsKey(num)){
                count.put(num,1);
            }
            else{
                count.replace(num,count.get(num)+1);
                return true;
            }
        }
        return false;
        
    }
}