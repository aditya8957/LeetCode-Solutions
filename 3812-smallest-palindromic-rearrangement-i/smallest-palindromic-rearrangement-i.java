class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int f = freq[i] / 2;
            int f2 = freq[25 - i] / 2;

            while (f > 0) {
                ans.append((char) ('a' + i));
                f--;
            }

            while (f2 > 0) {
                temp.append((char) ('a' + (25 - i)));
                f2--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                ans.append((char) ('a' + i));
            }
        }

        ans.append(temp);
        return ans.toString();
    }
}