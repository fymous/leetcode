class Solution {
    public int singleNonDuplicate(int[] nums) {
        int p = 0;
        int n1 = nums.length-1;
        int n = nums.length-1;
        if(n==0) return nums[0];
        while(p<n) {
            if(p+1 < n1 && nums[p] == nums[p+1]) p = p+2;
            else return nums[p];
            if(n-1 > 0 && nums[n] == nums[n-1]) n = n-2;
            else return nums[n];
        }
        return nums[p]; // edge case where mid is the target [1,1,2,3,3] . here we can return the lower 
    }
}

//not a binary search solution. mostly 2 pointer. Still O(logn)
