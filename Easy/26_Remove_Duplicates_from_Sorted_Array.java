class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int j = 1;
        int a = nums[0];
        temp[0] = nums[0];
        for(int i = 1; i < n; i++) {
            if(nums[i] != a) {
                temp[j] = nums[i];
                j++;
                a = nums[i];
            }
        }
        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        return j;
    }
}