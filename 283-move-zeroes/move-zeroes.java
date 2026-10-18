class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        // Find the first zero
        while (j < nums.length && nums[j] != 0) {
            j++;
        }

        // Find non-zero elements after the first zero
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}