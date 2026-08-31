class Solution {
    public String removeOuterParentheses(String s) {
        char[]a=s.toCharArray();
        int count=0;
        int n=a.length;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<n;i++){
            if(a[i]=='('){
                count++;
                ans.append('(');
            }
            else{
            if(count==0){
                i++;
            }
            else{
                ans.append(')');
                count--;
            }
        }
        }
        return ans.toString();
    }
}