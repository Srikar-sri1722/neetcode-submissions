class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.length() > 1 || Character.isDigit(s.charAt(0))){
                stack.push(Integer.parseInt(s));
            }else{
                int first=stack.pop();
                int second=stack.pop();
                int ans=0;
                if(tokens[i].equals("+")){
                    ans=first+second;
                }
                else if(tokens[i].equals("-")){
                    ans=second-first;
                }
                else if(tokens[i].equals("*")){
                    ans=first*second;
                }
                else if(tokens[i].equals("/")){
                    ans=second/first;
                }
                stack.push(ans);
            }
        }
        return stack.pop();
    }
}
