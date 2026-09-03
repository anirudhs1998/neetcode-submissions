class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLength = 0;
        for(int i =0; i<nums.length;i++){
            int start = nums[i];
            if(set.contains(start - 1)) continue;
            int length = 1;
            start = start + 1;
            while(set.contains(start)){
                length = length + 1;
                start = start + 1;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
