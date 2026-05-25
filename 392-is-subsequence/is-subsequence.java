class Solution {
    public boolean isSubsequence(String s1, String t) {
        int n = s1.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == t.charAt(j)){
                i++;
                j++;

            }
            else
                j++;
        }
       
        return i == n;
    }
}