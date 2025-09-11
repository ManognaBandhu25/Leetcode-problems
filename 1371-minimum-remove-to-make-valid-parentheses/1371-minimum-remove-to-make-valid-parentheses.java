class Solution {
    public String minRemoveToMakeValid(String s) {
    StringBuilder sb = new StringBuilder(s);
    Stack<Integer> openBracketPos = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        if (sb.charAt(i) == '(') {
            openBracketPos.add(i);
        } else if (sb.charAt(i) == ')') {
            if (openBracketPos.isEmpty()) {
                sb.setCharAt(i, '*');
            } else {
                openBracketPos.pop();
            }
        }
    }

    while (!openBracketPos.isEmpty()) {
        sb.setCharAt(openBracketPos.pop(), '*');
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < sb.length(); i++) {
        if (sb.charAt(i) != '*') {
            result.append(sb.charAt(i));
        }
    }

    return result.toString();
}
}