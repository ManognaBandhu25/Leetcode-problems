class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<operations.length;i++){
            if(!operations[i].equals("D")&&!operations[i].equals("C") &&!operations[i].equals("+")){
                int res=Integer.parseInt(operations[i]);
                st.push(res);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int num1=st.peek();
                st.push(num1*2);
            }
            else if(operations[i].equals("+")){
                int num2=st.pop();
                int num3=st.peek();
                st.push(num2);
                st.push(num2+num3);
            }

        }
        int sum=0;
        for(int i:st){
            sum+=i;

        }
        return sum;
    }
}