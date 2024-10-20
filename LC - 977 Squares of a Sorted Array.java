//https://leetcode.com/problems/squares-of-a-sorted-array/description/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;        
        int[] target = new int[n];
        for(int i=n-1; i>=0; i--) {
            if(Math.abs(nums[start]) >= Math.abs(nums[end])) {
                target[i] = nums[start] * nums[start];
                start++;
            } else {
                target[i] = nums[end] * nums[end];
                end--;
            }

        }
        return target;
    }
}
