class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int oddCount = 0, evenCount = 1; // evenCount starts at 1 to handle prefix sum cases
        int prefixSum = 0, result = 0;

        for (int num : arr) {
            prefixSum += num;

            // If prefix sum is odd
            if (prefixSum % 2 == 1) {
                result = (result + evenCount) % mod;
                oddCount++;
            } 
            // If prefix sum is even
            else {
                result = (result + oddCount) % mod;
                evenCount++;
            }
        }
        return result;
    }
}