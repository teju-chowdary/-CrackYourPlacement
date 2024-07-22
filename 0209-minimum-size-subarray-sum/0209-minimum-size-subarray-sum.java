class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = n + 1;
        int i = 0;
        int currSum = 0;

        for(int j = 0 ; j < n ; j++){
            currSum += nums[j];

            while(currSum >= target){
                minLen = Math.min(minLen , j - i + 1);
                currSum -= nums[i++];

            }
        }

        return minLen == n + 1 ? 0 : minLen;
        
    }
}