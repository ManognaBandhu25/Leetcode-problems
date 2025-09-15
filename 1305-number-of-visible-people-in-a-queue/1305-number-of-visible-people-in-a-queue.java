import java.util.*;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        
        st.push(n - 1); 
        for (int i = n - 2; i >= 0; --i) {
            int c = 0;
            
            while (!st.isEmpty() && heights[i] > heights[st.peek()]) {
                c++;
                st.pop();
            }
            
            if (!st.isEmpty()) {
                c++;
            }
            
            res[i] = c;   
            st.push(i);   
        }
        
        return res;
    }
}
