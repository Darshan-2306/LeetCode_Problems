class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int b=n+m,j=0;
        int[] arr=new int[b];
        for(int i=0;i<n;i++){
            arr[j++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[j++]=nums2[i];
        }
        Arrays.sort(arr);
        double d=0;
        if(b%2==1){
            d=(double)arr[b/2];
        }
        else{
            d=((double)arr[(b/2)-1]+(double)arr[b/2])/2;
        }
        return d;
    }
}