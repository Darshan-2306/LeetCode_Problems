class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left = 0;
        int right =n-1;
        int max=0;
        while(left < right)
        {
            if(height[left] <= height[right])
            {
                int temp=(right-left)*height[left];
                if(max<temp)
                {
                    max=temp;
                }
                left++;
            }
            else{
                  int temp=(right-left)*height[right];
                if(max<temp)
                {
                    max=temp;
                }
                right--;
            }
        }
        return max;
    }
}