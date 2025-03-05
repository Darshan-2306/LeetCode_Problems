class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE,n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]-min);
        }
        return sum;
    }
}