class Solution {
    public int totalWaviness(int num1, int num2) {
        if (num1 <= 100 && num2 <= 100)
            return 0;
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (i > 100) {
                String nums = String.valueOf(i);

                for (int j = 1; j < nums.length() - 1; j++) {
                    if (((nums.charAt(j) - '0' > nums.charAt(j - 1) - '0') &&
                            (nums.charAt(j) - '0' > nums.charAt(j + 1) - '0'))
                            ||
                            ((nums.charAt(j) - '0' < nums.charAt(j - 1) - '0') &&
                                    (nums.charAt(j) - '0' < nums.charAt(j + 1) - '0'))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}