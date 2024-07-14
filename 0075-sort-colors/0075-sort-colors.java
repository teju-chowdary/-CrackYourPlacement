class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = 0;
        int q = n - 1;
        while(j <= q){
            if(nums[j] == 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }else if(nums[j] == 2){
                 int t = nums[q];
                nums[q] = nums[j];
                nums[j] = t;
                q--;

            }else{
            j++;
            }
        }
        
    }
}