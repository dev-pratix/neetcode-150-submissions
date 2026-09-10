class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = Arrays.asList("+", "*", "-", "/");
        for (String token : tokens) {
            if (!operators.contains(token)) {
                int num = Integer.parseInt(token);
                stack.push(num);
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();

                int res = 0;
                switch (token) {
                    case "+": {
                        res = num1 + num2;
                        break;
                    }
                    case "-": {
                        res = num1 - num2;
                        break;
                    }
                    case "*": {
                        res = num1 * num2;
                        break;
                    }
                    case "/": {
                        res = num1 / num2;
                        break;
                    }
                }

                stack.push(res);
            }
        }

        return stack.pop();
    }
}
