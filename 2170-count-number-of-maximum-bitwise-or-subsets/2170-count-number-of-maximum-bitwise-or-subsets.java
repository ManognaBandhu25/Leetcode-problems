class Solution {
    int count = 0, max_or = 0;

    public int countMaxOrSubsets(int[] nums) {

        for (int num : nums) max_or |= num;
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

        backtrack(index + 1, nums, curr_or | nums[index]);
        backtrack(index + 1, nums, curr_or);
    }
}