class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = nums[nums.length/2];
        int start = 0;
        int end = nums.length;
        int output = 0;

        if (target == mid) {
            return nums.length/2;
        } else if(target > nums[nums.length - 1]) {
            return nums.length;
        } else if(target > mid) {
            start = nums.length/2;
            end = nums.length;
        } else if (target < mid) {
            start = 0;
            end = nums.length/2;
        } 

        for(int i = start; i < end; i++) {
            if(target > nums[i] &&  target < nums[i+1]) {
                output = i + 1;
                break;
            }
        }

        return output;
    }
}