class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n <= 1) {
            return;
        }

        k = k % n;

        if (k == 0) {
            return;
        }

        reverseRange(nums, 0, n - 1);
        reverseRange(nums, 0, k - 1);
        reverseRange(nums, k, n - 1);
    }

    private void reverseRange(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}