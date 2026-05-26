class Solution {
    public int titleToNumber(String columnTitle) {
       
        int n = columnTitle.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += (int)(Math.pow(26, n-i-1))*(columnTitle.charAt(i)-64);
        }
        return ans;
    }
}

// 26*len-1*26+25