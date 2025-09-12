class Solution {
    public boolean parseBoolExpr(String expr) {
        Stack<Character> exp = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<expr.length();i++){
            char ch = expr.charAt(i);
            if(ch=='!' || ch=='&' || ch=='|'){
                op.push(ch);
            }
            else if(ch=='(' || ch=='f' || ch=='t'){
                exp.push(ch);
            }
            else if(ch==')'){
                char bo_op = op.pop();
                if(bo_op == '&'){
                    boolean ans = true;
                    while(exp.peek()!='('){
                        if(exp.peek()=='f'){
                           ans = ans & false;
                        }
                        else{
                            ans = ans & true;
                        }
                        exp.pop();
                    }
                    exp.pop();
                    if(ans==false) exp.push('f');
                    else exp.push('t');
                }
                else if(bo_op == '|'){
                    boolean ans = false;
                    while(exp.peek()!='('){
                       if(exp.peek()=='f'){
                           ans = ans | false;
                        }
                        else{
                            ans = ans | true;
                        }
                        exp.pop();
                    }
                    exp.pop();
                    if(ans==false) exp.push('f');
                    else exp.push('t');
                }
                else{

                    if(exp.peek()=='f'){
                        exp.pop();
                        exp.pop();
                        exp.push('t');
                    }
                    else{
                        exp.pop();
                        exp.pop();
                        exp.push('f');
                    }
                }
            }
        }

        if(exp.peek()=='f') return false;

        return true;
    }
}