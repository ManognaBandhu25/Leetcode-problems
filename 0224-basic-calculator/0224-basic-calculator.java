class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int res=0;
        int n=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }
            else if (ch =='+' || ch == '-'){
                res+=n*sign;
                n=0;
                sign=(ch=='-') ? -1 :1;
            }else if(ch == '('){
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }else if(ch == ')'){
                res=res + n*sign;
                n=0;
                res*=stack.pop();
                res+=stack.pop();
            }
        }
        return res+n*sign;
    }
}