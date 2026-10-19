class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
 
        // long protects the multiplication and accumulated sum from overflow.
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;
 
        // Combine all present values so their contribution can be removed.
        for (int value : nums) {
            actualSum += value;
        }
 
        return (int) (expectedSum - actualSum);
    }
}