class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) return "";

        StringBuilder ans = new StringBuilder();

        int n = sum / 9;
        int rem = sum % 9;

        while (n > 0) {
            ans.append("9");
            n--;
        }

        if (rem > 0) {
            ans.append(rem);
        }

        int l = num - ans.length();

        while (l > 0) {
            ans.append("0");
            l--;
        }

        return ans.toString();
    }
}