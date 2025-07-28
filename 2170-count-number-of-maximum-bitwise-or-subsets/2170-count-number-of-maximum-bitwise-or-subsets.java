class Solution {
    int count = 0, max_or = 0;

    public int countMaxOrSubsets(int[] nums) {
        // Step 1: Compute the maximum OR
        for (int num : nums) max_or |= num;

        // Step 2: Use backtracking to count valid subsets
        backtrack(0, nums, 0);
        return count;
    }

    public void backtrack(int index, int[] nums, int curr_or) {
        if (index == nums.length) {
            if (curr_or == max_or) {
                count += 1;
            }
            return;
        }

        // Include current number
        backtrack(index + 1, nums, curr_or | nums[index]);

        // Exclude current number
        backtrack(index + 1, nums, curr_or);
    }
}