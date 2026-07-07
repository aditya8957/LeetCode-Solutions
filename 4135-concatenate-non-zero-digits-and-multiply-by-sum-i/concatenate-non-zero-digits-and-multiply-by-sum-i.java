class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
        String s = String.valueOf(n);

        String temp = "";
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '0'){
                temp += s.charAt(i);
                sum +=  s.charAt(i) - '0';
            }
        }
        long num = Long.parseLong(temp);
        return num*sum;

    }
}