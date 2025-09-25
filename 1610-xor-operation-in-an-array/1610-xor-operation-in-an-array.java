class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int [n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            nums[i]=start+2*i;
            s=s^nums[i];
        }
        return s;
    }
}