class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int a : arr) {
            totalSum += a;
        }

        if (totalSum % 3 != 0) {
            return false;
        }

        int target = totalSum / 3;
        int parts = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == target) {
                parts++;
                sum = 0;
            }
        }

        return parts >= 3;
    }
}
