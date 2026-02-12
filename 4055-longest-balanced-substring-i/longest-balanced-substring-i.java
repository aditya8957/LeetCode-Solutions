class Solution {
    public boolean isBalanced(int[] count) {
        int freq = 0;
        for (int c : count) {
            if (c != 0) {
                if (freq == 0) freq = c;  
                else if (c != freq) return false;
            }
        }
        return true;
    }

    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            for (int j = i; j < n; j++) {
                count[s.charAt(j) - 'a']++;

                if (isBalanced(count)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

}
