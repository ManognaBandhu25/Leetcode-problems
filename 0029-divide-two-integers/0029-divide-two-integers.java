class Solution {
    public int divide(int dividend, int divisor) {
       
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == divisor) return 1;
        boolean sign = (dividend > 0) ^ (divisor > 0);
        long D = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        long res = 0;
        while(D >= d){
            int power = 0;
            while(D >= d << power + 1){
                power++;
            }
            D = D - (d << power);
            res = res + (1 << power);
        }
        return sign ? -(int)res : (int)res;

    }
}