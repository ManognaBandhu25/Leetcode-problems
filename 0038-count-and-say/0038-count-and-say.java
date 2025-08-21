class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            res = countAndAdd(res);
        }
        return res;
    }

    String countAndAdd(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char ch = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            } else {
                sb.append(count).append(ch);
                ch = s.charAt(i);
                count = 1;
            }
        }

        sb.append(count).append(ch);  // append last group
        return sb.toString();
    }
}
