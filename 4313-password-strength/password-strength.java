class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> st = new HashSet<>();
        int n = password.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            char ch = password.charAt(i);
            if(st.isEmpty() || !st.contains(ch)){
                if(ch>='a' && ch <='z') ans+=1;
                else if(ch>='A' && ch<='Z') ans+=2;
                else if(ch>='0' && ch<='9') ans+=3;
                else ans+=5;
                st.add(ch);
            }
        }
        return ans;
    }
}