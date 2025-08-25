class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        String back = "../";
        String current = "./";
        for(String s : logs){
            if(s.equals(back) && !st.isEmpty()  ) st.pop();
            else if (!s.equals(back) && !s.equals(current)) 
            st.push(s);

        }

        return st.size();
    }
}