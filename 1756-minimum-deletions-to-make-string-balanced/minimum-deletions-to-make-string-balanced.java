class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int c = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(st.isEmpty()){
                st.add(s.charAt(i));
            }
            else if(st.peek() == 'b' && s.charAt(i) == 'a'){
                st.pop();
                c++;
            }
            else
            st.add(s.charAt(i));
            
        }
        return c;
    }
}