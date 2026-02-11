class Solution {
    public boolean find(int idx, String s, List<String> wordDict,Boolean[] dp){
        if(idx == s.length()) return true;

        if(dp[idx] != null) return dp[idx];

        for(int i = idx; i<s.length(); i++){
            String str = s.substring(idx,i+1);
            if(wordDict.contains(str)){
                if(find(i+1,s,wordDict,dp)){
                    dp[i] =  true;
                    return true;
                }
            }
        }
        
        return dp[idx] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return find(0,s,wordDict,dp);
    }
}