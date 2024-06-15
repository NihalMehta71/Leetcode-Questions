class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breakpoint = 0;
        for(int i = 0; i < n-1; i++) {
            if(nums[i+1] < nums[i]) {
                breakpoint = i+1;
                break;
            }
        }
        for(int i = 1; i < breakpoint; i++) {
            if(nums[i] < nums[i-1]) {
                return false;
            }
        }
        for(int i = breakpoint; i < n-1; i++) {
            if(nums[i+1] < nums[i]) {
                return false;
            }
        }
        if(breakpoint != 0) {
        if(nums[0] < nums[n-1]) {
            return false;
        }
        }
        return true;
    }
}