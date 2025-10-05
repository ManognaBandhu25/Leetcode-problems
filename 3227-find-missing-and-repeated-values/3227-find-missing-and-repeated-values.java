class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int s1=grid.length;
        int s2=s1*s1;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int res[]=new int[2];
       for(int i=0;i<=s2;i++){
        if(map.containsKey(i)){
            if(map.get(i)>=2){
                res[0]=i;
            }
        }
        else{
            res[1]=i;
        }
       }
        return res;
    }
}