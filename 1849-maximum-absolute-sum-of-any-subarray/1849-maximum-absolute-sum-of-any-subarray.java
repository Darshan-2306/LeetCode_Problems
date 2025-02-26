class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min=0,max=0,n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        sum=0;
        for(int i=0;i<n;i++){
            if(sum>0){
                sum=0;
            }
            sum+=nums[i];
            min=Math.min(min,sum);
        }
        return Math.max(max,Math.abs(min));
    }
}