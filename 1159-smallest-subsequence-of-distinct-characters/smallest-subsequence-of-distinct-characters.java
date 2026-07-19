class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        int[] lastIdx = new int[26];

        for(int j = 0; j<26; j++){     
            lastIdx[j] = -1;
            freq[j] = -1;
           
        }
        for(int i=0; i<n; i++){  
            lastIdx[s.charAt(i)-'a'] = i;
            
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if(freq[idx] != -1) continue;

            while(sb.length()>0 && ch < sb.charAt(sb.length() - 1) && lastIdx[sb.charAt(sb.length() - 1) - 'a'] > i){
                freq[sb.charAt(sb.length() - 1) - 'a'] = -1;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            sb.append(ch);
            freq[idx] = 1;
            
        }
        return sb.toString();

    }
}