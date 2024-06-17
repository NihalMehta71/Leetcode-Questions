class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int j = 0;
        
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                j = i;
            }
            else if(nums[i] < target){
                j = i+1;
            }
        }
       
        return j;
    }
}