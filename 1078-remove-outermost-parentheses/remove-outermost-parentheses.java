class Solution {
    public String removeOuterParentheses(String s) {
        ArrayList<String> list = new ArrayList<>();
        int n = s.length();
        int open = 0;
        int close = 0;
        String ans = "";
        int j = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                close++;
            }
            if(open-close == 0){
                String temp = s.substring(j,i+1);
                if(temp.length() == 2) ans += "";
                else{
                    ans += temp.substring(1,temp.length()-1);
                }
                j = i+1;
                open = 0;
                close = 0;
            }
        }
        return ans;
    }
}