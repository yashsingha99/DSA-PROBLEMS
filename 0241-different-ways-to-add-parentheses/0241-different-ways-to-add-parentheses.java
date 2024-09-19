class Solution {
    List<Integer> cal(String exp, int idx, int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = idx; i < n; i++) {
            if (exp.charAt(i) == '-' || exp.charAt(i) == '+' || exp.charAt(i) == '*') {
                  List<Integer> left = cal(exp.substring(0, i), 0, i);
                List<Integer> right = cal(exp.substring(i + 1), 0, n - (i + 1));
                for (int x : left) {
                    for (int y : right) {
                        if (exp.charAt(i) == '-')
                            ans.add(x - y);
                        else if (exp.charAt(i) == '+')
                            ans.add(x + y);
                        else if (exp.charAt(i) == '*')
                            ans.add(x * y);

                    }
                }

            }
        }
        if (ans.isEmpty())
            ans.add(Integer.parseInt(exp));
        return ans;
    }

    public List<Integer> diffWaysToCompute(String exp) {
        int n = exp.length();
        return cal(exp, 0, n);
    }
}