class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        backtrack(0,0,n,res,s);
        return res;
    }

    private void backtrack(int openCount, int closeCount, int n, List<String> res, StringBuilder s) {
        if(openCount == closeCount && closeCount == n) {
            res.add(s.toString());
            return;
        }

        if(openCount < n) {
            s.append('(');
            backtrack(openCount+1, closeCount, n, res, s);
            s.deleteCharAt(s.length()-1);
        }

        if(closeCount < openCount) {
            s.append(')');
            backtrack(openCount, closeCount+1, n, res, s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
