class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arraySet = new HashSet<Integer>();
        for(Integer i=0; i<nums.length; i++){
            if(arraySet.contains(nums[i])){
                return true;
            }
            arraySet.add(nums[i]);
        }

        return false;
    }
}