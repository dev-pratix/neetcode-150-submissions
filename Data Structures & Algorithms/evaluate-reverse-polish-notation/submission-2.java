class Solution {
    public int evalRPN(String[] tokens) {
        List<String> list =new ArrayList<>(Arrays.asList(tokens));
        return dfs(list);
    }

    public int dfs(List<String> list){
        String token = list.remove(list.size()-1);
        if("+-*/".indexOf(token)==-1){
            return Integer.parseInt(token);
        }

        int right = dfs(list);
        int left = dfs(list);

        switch(token){
            case "+" : return left + right;
            case "-" : return left - right;
            case "*" : return left * right;
            case "/" : return left / right;
        }

        return 0;
    }
}
