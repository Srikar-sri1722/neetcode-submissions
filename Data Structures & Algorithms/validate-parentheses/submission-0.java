class Solution {
    public boolean isValid(String st) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                else if((ch=='}'&&s.peek()!='{')||(ch==')'&&s.peek()!='(')||ch==']'&&s.peek()!='['){
                    return false;
                }else{
                    s.pop();
                }
            }
        }
        return s.size()==0;
    }
}
