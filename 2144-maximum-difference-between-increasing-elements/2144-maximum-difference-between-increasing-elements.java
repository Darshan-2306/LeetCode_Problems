
   class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int minelement= nums[0];
        int maxelement = -1;
        for(int i=1;i<n;i++){
            if(nums[i]>minelement){
                maxelement = Math.max(maxelement,nums[i]-minelement);
            }
            else{
                minelement = nums[i];
            }
        }
        return maxelement;
    }
}