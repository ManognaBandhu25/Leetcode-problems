class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert to long to handle edge case where n = Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x; // If power is negative, take reciprocal
            N = -N;
        }

        return fastPow(x, N);
    }

    // Helper method to compute power using fast exponentiation (recursive)
    private double fastPow(double x, long n) {
        if (n == 0) return 1.0; // Base case: x^0 = 1

        double half = fastPow(x, n / 2); // Recursively calculate x^(n/2)

        if (n % 2 == 0) {
            return half * half; // If even: x^n = (x^(n/2))^2
        } else {
            return half * half * x; // If odd: x^n = (x^(n/2))^2 * x
        }
    }
}
