class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int val1 = st.pop();
                int val2 = st.pop();
                int sum = val1+val2;
                st.push(val2);
                st.push(val1);
                st.push(sum);
            }
            
            else if (operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int val= st.peek();
                val*=2;
                st.push(val);
            }
            
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}