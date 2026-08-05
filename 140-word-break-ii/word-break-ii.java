class Solution {
    public void find(int idx, String s, List<String> wordDict,String curr,List<String> ans){
        if(idx >= s.length()){
            ans.add(curr);
            return;
        }

        for(int i = idx; i<s.length(); i++){
            String str = s.substring(idx,i+1);
            String old = curr;
            if(wordDict.contains(str)){
                if (!curr.isEmpty()) {
                    curr += " ";
                }
                curr += str;
                find(i+1,s,wordDict,curr,ans);
                curr = old;
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        find(0,s,wordDict,"",ans);
        return ans;
    }
}