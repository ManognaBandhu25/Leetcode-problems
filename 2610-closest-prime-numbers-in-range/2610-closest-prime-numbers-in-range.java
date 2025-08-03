class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] res={-1,-1};
        int prev=0;
        int min=Integer.MAX_VALUE;

        for(int i=left;i<=right;i++){
            if(i==2 || i==3 || i==5 || i==7) {
                if(prev==0) prev=i;
                else {res[0]=prev;res[1]=i;return res;}
            }
            else if(i%2==0 || i%3==0) continue;
            else if(isPrime(i)){
                if(prev==0) prev=i;
                else if(i-prev<min){
                    res[0]=prev;
                    res[1]=i;
                    min=i-prev;
                    if(min==2) return res;
                }
                prev=i;
            }
        }
        return res;
    }

    boolean isPrime(int x){
        if(x<5) return false;
        for(int i=5;i*i<=x;i+=6){
            if(x%i==0 || x%(i+2)==0) return false;
        }
        return true;
    }
}