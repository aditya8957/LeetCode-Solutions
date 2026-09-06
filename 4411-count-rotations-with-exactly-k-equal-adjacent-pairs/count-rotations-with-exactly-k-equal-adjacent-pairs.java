class Solution {
    public int countRotations(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int ans = 0;
        for(int i=0; i<sb.length(); i++){
            int count = 0;
            for(int j=0; j<sb.length()-1; j++){
                if(sb.charAt(j) == sb.charAt(j+1)){
                    count++;
                }
            }
            if(count == k) ans++;
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);

        }
        return ans;
    }
}