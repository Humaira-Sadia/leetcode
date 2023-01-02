class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for(String s : tokens){
            if("+".equals(s)){
                a = stack.pop();
                b = stack.pop();
                stack.push(a + b);
            }
            else if("-".equals(s)){
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            }
            else if("*".equals(s)){
                a = stack.pop();
                b = stack.pop();
                stack.push(a * b);
            }
            else if("/".equals(s)){
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            }
            else stack.push(Integer.valueOf(s));
        }
        return stack.peek();
    }
}

//time complexity = O(n)
//soace complexity = O(n)