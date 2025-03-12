class Solution {
    public int maximumCount(int[] nums) {
        int n=0;
        int m=0;
        for(int i : nums)
        {
            if(i<0)
            {
                n++;
            }
            else if(i>0)
            {
                m++;
            }
        }
        return Math.max(n,m);
    }
}